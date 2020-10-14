package com.github.hasanyelaldi.rabbitmq.controller;

import com.github.hasanyelaldi.rabbitmq.model.User;
import com.github.hasanyelaldi.rabbitmq.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{userId}")
    public User getUser(@PathVariable String userId) {
        return userService.getUser(userId);
    }

    @GetMapping("/users")
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @PostMapping("/createUser")
    public User createUser(@RequestBody User user) {
        return userService.createUser(user);
    }

    @PutMapping("/updateUser/{userId}")
    public User updateUser(@PathVariable String userId, @RequestBody User user) {
        return userService.updateUser(userId, user);
    }

    @DeleteMapping("/deleteUser/{userId}")
    public String deleteUser(@PathVariable String userId) {
        return userService.deleteUser(userId);
    }

}
