package com.xworkz.servlet.services;

import com.xworkz.servlet.dto.MesshoDto;

import java.util.List;

public interface MesshoService {

    boolean addDetails(MesshoDto messhoDto);
    MesshoDto getUserById(int id);
    MesshoDto getUserByUserName(String userName);
    List<MesshoDto> getAllMesshoDetails();
}
