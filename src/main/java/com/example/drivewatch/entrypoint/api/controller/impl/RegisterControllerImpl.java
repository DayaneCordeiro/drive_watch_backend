package com.example.drivewatch.entrypoint.api.controller.impl;

import com.example.drivewatch.entrypoint.api.controller.RegisterController;
import com.example.drivewatch.entrypoint.api.dto.RegisterDTO;
import com.example.drivewatch.entrypoint.api.facade.RegisterFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RegisterControllerImpl implements RegisterController {

    private final RegisterFacade facade;

    @Override
    public RegisterDTO get() {
        return facade.get();
    }
}
