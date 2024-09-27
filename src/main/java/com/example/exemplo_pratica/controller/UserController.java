package com.example.exemplo_pratica.controller;

import com.example.exemplo_pratica.model.User;
import com.example.exemplo_pratica.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/user")
@AllArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @GetMapping
    public ResponseEntity<List<User>> allUsers() {
        List<User>  userList = userRepository.findAll();

        return ResponseEntity.ok(userList);
    }
}
