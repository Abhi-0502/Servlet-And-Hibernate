package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.PlayStoreDto;

import java.util.List;

public interface PlayStoreService {

    boolean validateAndSavePassport(PlayStoreDto playStoreDto);
    PlayStoreDto getProductById(int id);
    PlayStoreDto getUserByUserName(String userName);
    List<PlayStoreDto> getAllUser();
}
