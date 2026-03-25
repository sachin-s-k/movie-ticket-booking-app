package com.objecoriented.bookmyshow.dtos;

import com.objecoriented.bookmyshow.models.User;
import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class CreateUserResponseDto {

    private User user;
}
