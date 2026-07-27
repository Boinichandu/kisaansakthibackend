package com.example.kisansakthi.service;

import com.example.kisansakthi.model.User;

import java.util.List;

public interface UserService {

    User registerUser(User user);

    List<User> getAllUsers();

    User getUserById(int id);

    User getUserByEmail(String email);

    User getUserByPhone(String phone);

    // Add this method
    User login(String email, String password);

    User updateUser(int id, User user);

    void deleteUser(int id);
}