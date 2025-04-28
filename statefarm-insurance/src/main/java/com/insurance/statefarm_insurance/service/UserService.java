package com.insurance.statefarm_insurance.service;

import com.insurance.statefarm_insurance.entity.User;
import com.insurance.statefarm_insurance.repository.UserRepository;
import org.modelmapper.internal.util.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private static final Logger log = LoggerFactory.getLogger(UserService.class);
    @Autowired
    UserRepository userRepository;


    public void registerUser(User user) {
        userRepository.save(user);
        log.info("User Saved : {}", user);
    }

    public User getUserById(Long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User updateUserById(User user, Long id) {
        User foundUser = getUserById(id);
        foundUser.setName(user.getName());
        foundUser.setEmail(user.getEmail());
        foundUser.setPolicies(user.getPolicies());
        foundUser.setRoleName(user.getRoleName());
        User updatedUser = userRepository.save(foundUser);
        log.info("User Has Been Updated : {}", updatedUser);
        return updatedUser;
    }
}
