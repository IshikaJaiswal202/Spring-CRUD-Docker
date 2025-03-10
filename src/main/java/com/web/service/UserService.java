package com.web.service;

import com.web.entity.Users;

import java.util.List;

public interface UserService {
    public Users addUsers(Users users) ;
    public List<Users> getAll() ;
    public void deleteUserById(int id);
    }
