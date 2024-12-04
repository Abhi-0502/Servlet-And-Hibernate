package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.UserDto;

public interface UserDao {

    boolean addUserLogin(UserDto userDto);
}
