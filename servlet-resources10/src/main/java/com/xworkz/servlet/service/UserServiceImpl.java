package com.xworkz.servlet.service;

import com.xworkz.servlet.dao.UserDao;
import com.xworkz.servlet.dao.UserDaoImpl;
import com.xworkz.servlet.dto.UserDto;

public class UserServiceImpl implements UserService{


    UserDao userDao = new UserDaoImpl();
//    @Override
//    public boolean validateAndSaveUserLogin(UserDto userDto) {
//
//        boolean userNameValid = false;
//        boolean email = false;
//        boolean userDetailsStored = false;
//        UserDao userDao = new UserDaoImpl();
//
//        if(userDto != null) {
//            if (userDto.getUserName() != null && !userDto.getUserName().isEmpty()) {
//                System.out.println("UserName is validated!!.......");
//                userNameValid = true;
//            }
//            if (userDto.getEmail() != null && !userDto.getEmail().isEmpty()) {
//                System.out.println("Useremail is validated!!.......");
//               email = true;
//            }
//        }
//        if(userNameValid == true && email== true){
//            userDetailsStored = userDao.addUserLogin(userDto);
//        }
//        return userDetailsStored;
//    }

    @Override
    public boolean addUser(UserDto userDto) {
        boolean isaddUser = false;
        if(userDto != null && userDto.getId() > 0 && userDto.getUserName()!= null && userDto.getPhoneNumber()>0 && userDto.getEmail()!= null
        && userDto.getDob()>0 && userDto.getPassword()>0){

        }else {
            System.out.println("user added");
        }
        userDao.addUserLogin(userDto);
       return isaddUser;
    }
}
