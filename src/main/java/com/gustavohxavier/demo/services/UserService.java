package com.gustavohxavier.demo.services;

import com.gustavohxavier.demo.dtos.UserDto;
import com.gustavohxavier.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public UserDto findById(Long id){
        return new UserDto(userRepository.findById(id).get());
    }
}
