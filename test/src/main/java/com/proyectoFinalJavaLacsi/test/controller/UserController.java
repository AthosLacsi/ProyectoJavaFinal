package com.proyectoFinalJavaLacsi.test.controller;

import com.proyectoFinalJavaLacsi.test.dto.UserDTO;
import com.proyectoFinalJavaLacsi.test.model.User;
import com.proyectoFinalJavaLacsi.test.mapper.UserMapper;
import com.proyectoFinalJavaLacsi.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/usuarios")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<UserDTO> getAllUsers() {
        return userService.getAllUsers()
                .stream()
                .map(UserMapper::toDTO)
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public UserDTO getUserById(@PathVariable Long id) {
        User user = userService.getUserById(id)
                .orElseThrow(() -> new RuntimeException("Usuario no encontrado"));
        return UserMapper.toDTO(user);
    }

    @PostMapping
    public UserDTO createUser(@RequestBody UserDTO userDTO) {
        User user = UserMapper.toEntity(userDTO);
        User savedUser = userService.saveUser(user);
        return UserMapper.toDTO(savedUser);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
