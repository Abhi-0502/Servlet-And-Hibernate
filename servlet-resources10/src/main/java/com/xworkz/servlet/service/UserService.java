package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.UserDto;

public interface UserService {

    //boolean validateAndSaveUserLogin(UserDto userDto);
    boolean addUser(UserDto userDto);
}
