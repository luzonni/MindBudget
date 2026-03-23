package io.luzonni.mindbudget.repository;

import io.luzonni.mindbudget.domain.model.User;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UserRepository implements PanacheRepository<User> {

    //repositorio Panache de User

}
