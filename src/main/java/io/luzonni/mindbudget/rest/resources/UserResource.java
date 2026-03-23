package io.luzonni.mindbudget.rest.resources;

import io.luzonni.mindbudget.domain.model.User;
import io.luzonni.mindbudget.repository.UserRepository;
import io.luzonni.mindbudget.rest.dto.CreateUserRequest;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/users")
public class UserResource {

    private UserRepository userRepository;

    @Inject
    public UserResource(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @POST
    @Transactional
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response createUser(
            CreateUserRequest userRequest
    ) {
        User user = new User();
        user.setName(user.getName());
        user.setBirthday(userRequest.getBirthday());
        user.setPassword_hash(userRequest.getPasswordHash());
        return Response.ok().build();
    }

}
