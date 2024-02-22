package com.StepQuest.StepQuest.controller;

import com.StepQuest.StepQuest.exceptions.userExceptions.userNotFoundException;
import com.StepQuest.StepQuest.model.User;
import com.StepQuest.StepQuest.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api/users")
public class userController {

    @Autowired
    private userService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    User createUser(@RequestBody User userDetails){
        return userService.createUser(userDetails);
    }

    @PutMapping("/{id}")
    User editUser(@RequestBody User userDetails,@PathVariable Long id){
        return userService.updateUser(userDetails, id);
    }

}
