package com.objecoriented.bookmyshow.services;

import com.objecoriented.bookmyshow.dtos.CreateUserRequestDto;
import com.objecoriented.bookmyshow.dtos.CreateUserResponseDto;
import com.objecoriented.bookmyshow.models.User;
import com.objecoriented.bookmyshow.repositories.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService {

private UserRepository userRepository;

public CreateUserResponseDto createUser(CreateUserRequestDto  userDto){
    User user= new User();
    user.setEmail(userDto.getEmail());
    var savedUser=userRepository.save(user);
    return  new CreateUserResponseDto(user);
}

}
