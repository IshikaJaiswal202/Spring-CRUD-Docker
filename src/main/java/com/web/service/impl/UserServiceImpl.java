package com.web.service.impl;

import com.web.entity.Users;
import com.web.repo.UserRepo;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserRepo repo;

    @Override
    public void deleteUserById(int id) {
     repo.deleteById(id);
    }

    public Users addUsers(Users users) {
        System.out.println(users.getName());
        return repo.save(users);
    }


    public List<Users> getAll() {
        return repo.findAll();
    }
}
