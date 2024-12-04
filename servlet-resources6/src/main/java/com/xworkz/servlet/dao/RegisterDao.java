package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.RegisterDto;

import java.util.List;

public interface RegisterDao {

    boolean addRegisterDetails(RegisterDto registerDto);
    RegisterDto getRegisterById(int id);
    RegisterDto getRegisterUserName(String userName);
    List<RegisterDto> getAllUser();
}
