package com.proyectoFinalJavaLacsi.test.service;

import com.proyectoFinalJavaLacsi.test.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAllUsers();
    Optional<User> getUserById(Long id);
    User saveUser(User user);
    void deleteUser(Long id);
}
