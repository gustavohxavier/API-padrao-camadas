package com.gustavohxavier.demo.dtos;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class UserDto {

    private Long id;
    private String name;
}
