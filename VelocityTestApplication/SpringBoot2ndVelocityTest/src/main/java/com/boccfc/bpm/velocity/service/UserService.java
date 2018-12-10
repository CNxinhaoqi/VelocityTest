package com.boccfc.bpm.velocity.service;

import com.boccfc.bpm.velocity.User;
import com.boccfc.bpm.velocity.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    public List<User> getUsersInformation() {
        return  userRepository.findAll();
    }
}
