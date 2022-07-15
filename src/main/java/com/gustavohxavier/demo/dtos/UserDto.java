package com.gustavohxavier.demo.dtos;

import com.gustavohxavier.demo.entities.User;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

//@Component
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private Long id;
    private String name;

    public UserDto(User user){
        id = user.getId();
        name = user.getName();
    }
}
