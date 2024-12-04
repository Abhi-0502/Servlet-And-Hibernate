package com.xworkz.servlet.service;

import com.xworkz.servlet.dao.RegisterDao;
import com.xworkz.servlet.dao.RegisterDaoImpl;
import com.xworkz.servlet.dto.RegisterDto;

import java.util.Collections;
import java.util.List;

public class RegisterServiceImpl implements RegisterService{


    RegisterDao registerDao = new RegisterDaoImpl();

    @Override
    public boolean validateAndSaveRegister(RegisterDto registerDto) {
        if (registerDto != null) {
            boolean isUserNameValid = registerDto.getUserName() != null && !registerDto.getUserName().isEmpty();
            boolean isEmailValid = registerDto.getEmail() != null && !registerDto.getEmail().isEmpty();

            if (isUserNameValid && isEmailValid) {
                System.out.println("All fields are validated successfully.");
                System.out.println("service info :" + registerDto);
                return registerDao.addRegisterDetails(registerDto);
            } else {
                if (!isUserNameValid) {
                    System.out.println("Invalid username.");
                }
                if (!isEmailValid) {
                    System.out.println("Invalid email.");
                }
            }
        } else {
            System.out.println("RegisterDto is null.");
        }
        return false;
    }



    @Override
    public RegisterDto getUserById(int id) {
        if(id > 0){
            System.out.println("get user details added");
        }
        return registerDao.getRegisterById(id);
    }

    @Override
    public RegisterDto getRegisterUserName(String userName) {
        if (userName != null && !userName.isEmpty()) {
            System.out.println("userName is added");
        }
        return registerDao.getRegisterUserName(userName);
    }

    @Override
    public List<RegisterDto> getAllUser() {
        return registerDao.getAllUser();
    }
}
