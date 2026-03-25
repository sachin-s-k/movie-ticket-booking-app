package com.objecoriented.bookmyshow.controllers;

import com.objecoriented.bookmyshow.dtos.CreateUserResponseDto;
import com.objecoriented.bookmyshow.dtos.CreateUserRequestDto;
import com.objecoriented.bookmyshow.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class UserController {

    private UserService userService;


    public CreateUserResponseDto createUser(CreateUserRequestDto createUserRequestDto){
      return userService.createUser(createUserRequestDto);

    }
}
