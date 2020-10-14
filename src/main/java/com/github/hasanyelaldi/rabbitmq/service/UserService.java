package com.github.hasanyelaldi.rabbitmq.service;

import com.github.hasanyelaldi.rabbitmq.model.User;

import com.github.hasanyelaldi.rabbitmq.repository.UserRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public User getUser(String userId){
        return repository.get(userId);
    }

    public User createUser(User user) {
        return repository.push(user);
    }

    public User updateUser(String userId, User user){
        User userData = repository.get(userId);
        userData.setEmail(user.getEmail());
        userData.setPassword(user.getPassword());
        userData.setUsername(user.getUsername());
        return repository.update(userData);
    }

    public String deleteUser(String userId) {
        repository.remove(userId);
        return userId + "deleted";
    }

    public List<User> getAllUsers() {
        return repository.findAll();
    }
}
