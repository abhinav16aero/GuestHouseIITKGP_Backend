package com.abhinav16aero.guesthouseiitkgp.service;

import com.abhinav16aero.guesthouseiitkgp.model.User;

import java.util.List;

/**
 * @author Abhinav Kumar
 */

public interface IUserService {
    User registerUser(User user);
    List<User> getUsers();
    void deleteUser(String email);
    User getUser(String email);
}
