package com.example.flashcardsbackend.repositories;

import com.example.flashcardsbackend.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
