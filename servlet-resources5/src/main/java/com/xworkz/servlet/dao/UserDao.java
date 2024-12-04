package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.UserDto;

import java.util.List;

public interface UserDao {

    boolean addUserDetails(UserDto userDto);
    UserDto getUserbyId(int id);
    UserDto getUserByuserName(String userName);
    List<UserDto> getAllUser();
}
