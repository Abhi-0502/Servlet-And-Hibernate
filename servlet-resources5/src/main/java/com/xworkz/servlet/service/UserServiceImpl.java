package com.xworkz.servlet.service;

import com.xworkz.servlet.dao.UserDao;
import com.xworkz.servlet.dao.UserDaoImpl;
import com.xworkz.servlet.dto.UserDto;

import java.util.Collections;
import java.util.List;

public class UserServiceImpl implements Userservice {


    UserDao userDao = new UserDaoImpl();

    @Override
    public boolean addUserDetails(UserDto userDto) {

        if (userDto != null) {
            boolean isUserNameValid = userDto.getUserName() != null && !userDto.getUserName().isEmpty();
            boolean isEmailValid = userDto.getEmail() != null && !userDto.getEmail().isEmpty();

            if (isUserNameValid && isEmailValid) {
                System.out.println("All fields are validated successfully.");
                System.out.println("service info :" + userDto);
                return userDao.addUserDetails(userDto);
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
    public UserDto getUserbyId(int id) {
        if (id> 0){
            System.out.println("get userbyId details added");
        }
        return  userDao.getUserbyId(id);
    }

    @Override
    public UserDto getUserName(String userName) {
        if (userName!=null && !userName.isEmpty()){
            System.out.println("UserName is added");
        }
        return userDao.getUserByuserName(userName);
    }

    @Override
    public List<UserDto> getAllUser() {
        return userDao.getAllUser();
    }
}
