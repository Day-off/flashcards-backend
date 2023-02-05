package com.example.flashcardsbackend.mappers;

import com.example.flashcardsbackend.dto.UserDto;
import com.example.flashcardsbackend.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface UserMapper {

    UserDto userToDto(User user);

    User dtoToUser(UserDto userDto);
}
