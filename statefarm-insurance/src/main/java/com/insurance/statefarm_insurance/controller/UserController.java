package com.insurance.statefarm_insurance.controller;

import com.insurance.statefarm_insurance.entity.User;
import com.insurance.statefarm_insurance.service.UserService;
import org.modelmapper.internal.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @PostMapping("/register")
    public ResponseEntity<User> registerUser(@RequestBody User user) {
        userService.registerUser(user);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @GetMapping("/user-by-id/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(name = "id") Long id) {
        User user = userService.getUserById(id);
        return new ResponseEntity<>(user, HttpStatus.FOUND);
    }

    @GetMapping("/users")
    public ResponseEntity<List<User>> getAllUsers() {
        List<User> users = userService.getAllUsers();
        return new ResponseEntity<>(users, HttpStatus.OK);
    }

    @PutMapping("/update-user/{id}")
    public ResponseEntity<User> updateUserById(@RequestBody User user, @PathVariable(name = "id") Long id) {
        User updatedUser = userService.updateUserById(user, id);
        return new ResponseEntity<>(updatedUser, HttpStatus.ACCEPTED);
    }


}
