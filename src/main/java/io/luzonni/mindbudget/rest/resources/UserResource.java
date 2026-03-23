package io.luzonni.mindbudget.rest.resources;

import io.luzonni.mindbudget.domain.model.User;
import io.luzonni.mindbudget.repository.UserRepository;
import io.luzonni.mindbudget.rest.dto.CreateUserRequest;
import io.luzonni.mindbudget.rest.dto.ResponseError;
import io.luzonni.mindbudget.util.PasswordUtil;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.Validator;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.util.Set;

@Path("/users")
public class UserResource {

    private final UserRepository userRepository;
    private final Validator validator;

    @Inject
    public UserResource(UserRepository userRepository, Validator validator) {
        this.userRepository = userRepository;
        this.validator = validator;
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createUser(
            CreateUserRequest userRequest
    ) {
        Set<ConstraintViolation<CreateUserRequest>> validate = validator.validate(userRequest);
        if (!validate.isEmpty()) {
            return ResponseError.createError(validate).withStatusCode(ResponseError.UNPROCESSABLE_ENTITY_STATUS);
        }
        User user = new User();
        user.setUsername(userRequest.getUsername());
        user.setEmail(userRequest.getEmail());
        user.setBirthday(userRequest.getBirthday());
        String hashedPassword = PasswordUtil.hash(userRequest.getPassword());
        user.setPasswordHash(hashedPassword);
        if (userRepository.findByEmail(userRequest.getEmail()).isPresent()) {
            return Response.status(Response.Status.CONFLICT)
                    .entity("Email já cadastrado")
                    .build();
        }
        if (userRepository.findByUsername(userRequest.getUsername()).isPresent()) {
            return Response.status(Response.Status.CONFLICT)
                    .entity("Username já cadastrado")
                    .build();
        }
        userRepository.persist(user);
        return Response.ok("ID Gerado:" + user.getId()).build();
    }

}
