package com.syncro.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.syncro.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> { 

    Optional<User> findByName(String name);

    Optional<User> findByEmail(String email);
}


