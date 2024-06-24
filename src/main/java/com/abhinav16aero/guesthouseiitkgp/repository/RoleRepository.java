package com.abhinav16aero.guesthouseiitkgp.repository;

import com.abhinav16aero.guesthouseiitkgp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Abhinav Kumar
 */

public interface RoleRepository extends JpaRepository<Role, Long> {

    Optional<Role> findByName(String role);


    boolean existsByName(String role);
}
