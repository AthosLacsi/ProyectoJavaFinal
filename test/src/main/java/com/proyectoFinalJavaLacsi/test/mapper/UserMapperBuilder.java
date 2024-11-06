package com.proyectoFinalJavaLacsi.test.mapper;

import com.proyectoFinalJavaLacsi.test.model.User;

import com.proyectoFinalJavaLacsi.test.dto.UserDTO;

public class UserMapperBuilder {

    public static UserDTO buildDTO(User user) {
        return UserMapper.toDTO(user);
    }

    public static User buildEntity(UserDTO dto) {
        return UserMapper.toEntity(dto);
    }
}
