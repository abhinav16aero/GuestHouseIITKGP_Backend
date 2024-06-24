package com.abhinav16aero.guesthouseiitkgp.service;

import com.abhinav16aero.guesthouseiitkgp.model.Role;
import com.abhinav16aero.guesthouseiitkgp.model.User;

import java.util.List;

/**
 * @author Abhinav Kumar
 */

public interface IRoleService {
    List<Role> getRoles();
    Role createRole(Role theRole);

    void deleteRole(Long id);
    Role findByName(String name);

    User removeUserFromRole(Long userId, Long roleId);
    User assignRoleToUser(Long userId, Long roleId);
    Role removeAllUsersFromRole(Long roleId);
}
