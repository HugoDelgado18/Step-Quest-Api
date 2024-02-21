package com.StepQuest.StepQuest.exceptions.userExceptions;

public class userNotFoundException extends RuntimeException {
    public userNotFoundException(Long id){
        super("Could not find user with provided id: " + id + "\n" + "Please create account or correct login information.");
    }
}
