package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.MesshoDto;

import java.util.List;

public interface MeshoDao {

    boolean addDetails(MesshoDto messhoDto);
    MesshoDto getUserById(int id);
    MesshoDto getUserByUserName(String userName);
    List<MesshoDto> getAllMesshoDetails();
}
