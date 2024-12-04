package com.xworkz.servlet.service;

import com.xworkz.servlet.dto.PlayStoreDto;

public interface PlayStoreService {

    boolean validateAndSavePassport(PlayStoreDto playStoreDto);
}
