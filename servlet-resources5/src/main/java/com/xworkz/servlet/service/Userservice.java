package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.UserDto;

import java.util.List;

public interface Userservice {


    boolean addUserDetails(UserDto userDto);
    UserDto getUserbyId(int id);
    UserDto getUserName(String userName);
    List<UserDto> getAllUser();
}
