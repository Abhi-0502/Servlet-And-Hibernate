package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.RegisterDto;

import java.util.List;

public interface RegisterService {


    boolean validateAndSaveRegister(RegisterDto registerDto);
    RegisterDto getUserById(int id);
    RegisterDto getRegisterUserName(String userName);
    List<RegisterDto> getAllUser();
}
