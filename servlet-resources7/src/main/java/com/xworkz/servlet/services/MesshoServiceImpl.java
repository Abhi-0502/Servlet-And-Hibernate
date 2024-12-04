package com.xworkz.servlet.services;

import com.xworkz.servlet.dao.MeshoDao;
import com.xworkz.servlet.dao.MesshoDaoImpl;
import com.xworkz.servlet.dto.MesshoDto;

import java.util.Collections;
import java.util.List;

public class MesshoServiceImpl implements MesshoService{

    boolean isAllUserStoredDetails = false;
    MeshoDao meshoDao = new MesshoDaoImpl();

    @Override
    public boolean addDetails(MesshoDto messhoDto) {
        boolean isUserNameValid = false;
        boolean isUserAddress = false;


        if(messhoDto != null){
           if(messhoDto.getUserName()!= null && !messhoDto.getUserName().isEmpty()){
               System.out.println("UseName is validated");
               isUserNameValid = true;
           }
        }

        if (messhoDto.getAddress()!= null && !messhoDto.getAddress().isEmpty() ){
            System.out.println("UserAddress is Validated");
            isUserAddress = true;
        }


        // Check if both fields are valid
        if (isUserNameValid && isUserAddress) {
            isAllUserStoredDetails = meshoDao.addDetails(messhoDto);
            System.out.println("service info :" + messhoDto);
            if (isAllUserStoredDetails) {
                System.out.println("All fields are validated successfully and user added.");
            } else {
                System.out.println("Validation passed");
            }
        } else {
            System.out.println("Validation failed. Ensure both given name and email are valid.");
        }

        return  isAllUserStoredDetails;
    }


    @Override
    public MesshoDto getUserById(int id) {
        if(id > 0){
            System.out.println("Get the details UserById");
        }
        return meshoDao.getUserById(id);
    }

    @Override
    public MesshoDto getUserByUserName(String userName) {
        if (userName != null && !userName.isEmpty()){
            System.out.println("UserName is added");
        }
        return meshoDao.getUserByUserName(userName);
    }

    @Override
    public List<MesshoDto> getAllMesshoDetails() {
        System.out.println("get all service method started ");
        return meshoDao.getAllMesshoDetails();
    }
}
