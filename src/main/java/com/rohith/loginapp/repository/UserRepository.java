package com.rohith.loginapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rohith.loginapp.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    User findByEmailAndPassword(String email, String password);

    User findByEmail(String email);
}
