package com.example.flashcardsbackend.services;

import com.example.flashcardsbackend.dto.UserDto;
import com.example.flashcardsbackend.repositories.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserService {

    private final UserRepository userRepository;


    public void create(UserDto userDto) {

    }
}
