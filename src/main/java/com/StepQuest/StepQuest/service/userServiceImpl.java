package com.StepQuest.StepQuest.service;

import com.StepQuest.StepQuest.model.User;
import com.StepQuest.StepQuest.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService {

    private final userRepository userRepository;

    @Autowired
    public userServiceImpl(userRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        Optional<User> optionalUser = userRepository.findById(id);
        return optionalUser.orElse(null);
    }

    @Override
    public User createUser(User user) {
        // Perform any necessary validation or business logic
        // For example, check if the user already exists

        // Save the user using the repository
        return userRepository.save(user);
    }

    @Override
    public User updateUser(User user, Long id) {
        // Perform any necessary validation or business logic
        // For example, check if the user exists

        // Update the user using the repository
        return userRepository.save(user);
    }

    @Override
    public void deleteUser(Long id) {
        // Delete the user using the repository
        userRepository.deleteById(id);
    }
}
