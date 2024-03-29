package com.StepQuest.StepQuest.service;

import com.StepQuest.StepQuest.model.User;

import java.util.List;

public interface userService {

    List<User> getAllUsers();

    User getUserById(Long id);

    User getUserByUsername(String username);

    User createUser(User user);

    User updateUser(User user, Long id);

    void deleteUser(Long id);

    User registerUser(User user);

    User loginUser(String username, String password);
}