package com.example.exemplo_pratica.repository;

import com.example.exemplo_pratica.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
