package com.example.drivewatch.entrypoint.api.controller.impl;

import com.example.drivewatch.entrypoint.api.controller.PhoneController;
import com.example.drivewatch.entrypoint.api.dto.PhoneRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.PhoneResponseDTO;
import com.example.drivewatch.entrypoint.api.facade.PhoneFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class PhoneControllerImpl implements PhoneController {

    private final PhoneFacade facade;

    @Override
    public PhoneResponseDTO create(PhoneRequestDTO requestDTO) {
        return facade.create(requestDTO);
    }
}
