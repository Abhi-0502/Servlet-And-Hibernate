package com.xworkz.servlet.services;

import com.xworkz.servlet.dto.UserDto;

import java.util.List;

public interface UserService {

    boolean addUserDetails(UserDto userDto);
    UserDto getUserbyId(int id);
    UserDto getUserByUserName(String userName);
    List<UserDto> getAllUser();
}
