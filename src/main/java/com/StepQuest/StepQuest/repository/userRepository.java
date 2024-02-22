package com.StepQuest.StepQuest.repository;

import com.StepQuest.StepQuest.model.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepository extends JpaRepository<User, Long> {
    // You can define additional query methods here if needed
    User findByUsername(String username);
}
