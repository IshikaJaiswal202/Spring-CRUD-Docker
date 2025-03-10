package com.web.controller;

import com.web.entity.Users;
import com.web.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    UserService userService;
    @PostMapping
    public Users addStudent(@RequestBody Users users)
    {
        System.out.println(users);
        return userService.addUsers(users);
    }

    @GetMapping("/getAll")
    public List<Users> getAll()
    {
        return userService.getAll();
    }

    @DeleteMapping("/{id}")
    public String deleteUserById(@PathVariable Integer id)
    {
        userService.deleteUserById(id);
        return "deleted Successfully";
    }
}
