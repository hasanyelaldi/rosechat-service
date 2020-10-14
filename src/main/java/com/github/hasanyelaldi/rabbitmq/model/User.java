package com.github.hasanyelaldi.rabbitmq.model;

import com.github.fabiomaffioletti.firebase.document.FirebaseDocument;
import com.github.fabiomaffioletti.firebase.document.FirebaseId;

@FirebaseDocument("/users")
public class User {

    @FirebaseId
    private String userId;

    private String username;
    private String email;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
