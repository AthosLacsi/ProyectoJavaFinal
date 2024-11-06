package com.proyectoFinalJavaLacsi.test.mapper;

import com.proyectoFinalJavaLacsi.test.dto.UserDTO;
import com.proyectoFinalJavaLacsi.test.model.User;

public class UserMapper {

    public static UserDTO toDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setId(user.getId());
        dto.setNombre(user.getNombre());
        dto.setApellido(user.getApellido());
        dto.setEmail(user.getEmail());
        return dto;
    }

    public static User toEntity(UserDTO dto) {
        User user = new User();
        user.setNombre(dto.getNombre());
        user.setApellido(dto.getApellido());
        user.setEmail(dto.getEmail());
        return user;
    }
}
