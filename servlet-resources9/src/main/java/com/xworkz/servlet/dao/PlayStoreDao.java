package com.xworkz.servlet.dao;

import com.xworkz.servlet.dto.PlayStoreDto;

import java.util.List;

public interface PlayStoreDao {

    boolean addPlayStore(PlayStoreDto playStoreDto);
    PlayStoreDto getProductById(int id);
    PlayStoreDto getUserByUserName(String userName);
    List<PlayStoreDto> getAllUser();
}
