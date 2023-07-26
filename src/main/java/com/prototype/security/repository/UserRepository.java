package com.prototype.security.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prototype.security.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
