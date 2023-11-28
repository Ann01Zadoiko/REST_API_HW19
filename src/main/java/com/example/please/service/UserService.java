package com.example.please.service;

import com.example.please.entity.User;
import com.example.please.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository repository;

    public User findByUsername(String username) {
        Optional<User> user = repository.findById(username);

        if (user.isEmpty()) {
            return null;
        }

        return user.get();
    }

    public void saveUser(User user){
        repository.save(user);
    }

}
