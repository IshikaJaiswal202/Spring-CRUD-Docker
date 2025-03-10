package com.web.repo;

import com.web.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users, Integer> {
        }
