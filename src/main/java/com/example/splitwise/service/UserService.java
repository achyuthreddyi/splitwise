package com.example.splitwise.service;

import com.example.splitwise.models.User;
import com.example.splitwise.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

// -- addUsers --register -- login
@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public User addUser(User user) {
        if (user == null) {
            throw new IllegalArgumentException("user should not be null");
        }
        return userRepository.save(user);
    }

}
