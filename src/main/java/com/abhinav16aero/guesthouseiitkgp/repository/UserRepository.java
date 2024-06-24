package com.abhinav16aero.guesthouseiitkgp.repository;

import com.abhinav16aero.guesthouseiitkgp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Abhinav Kumar
 */

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    void deleteByEmail(String email);

   Optional<User> findByEmail(String email);
}
