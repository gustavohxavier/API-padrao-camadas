package com.gustavohxavier.demo.services;

import com.gustavohxavier.demo.dtos.UserDto;
import com.gustavohxavier.demo.entities.User;
import com.gustavohxavier.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private User user;

    @Autowired
    private UserDto userDto;

    public UserDto findById(Long id){
        user = userRepository.findById(id).get();
        userDto.setId(user.getId());
        userDto.setName(user.getName());
        return userDto;
    }
}
