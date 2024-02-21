package com.StepQuest.StepQuest.controller;

import com.StepQuest.StepQuest.model.User;
import com.StepQuest.StepQuest.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class userController {

    @Autowired
    private userRepository userRepository;

//    @GetMapping(path = "/users")
//    public List<User> getAllUsers() {
//        return userRepository.findAll();
//    }

    @GetMapping(path = "/users")
    public String getAllUsers() {
        return "word";
    }
}
