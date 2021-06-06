package com.example.springredditclone.repository;

import java.util.Optional;

import com.example.springredditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
