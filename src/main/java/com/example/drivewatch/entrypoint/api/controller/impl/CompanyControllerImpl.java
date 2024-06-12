package com.example.drivewatch.entrypoint.api.controller.impl;

import com.example.drivewatch.entrypoint.api.controller.CompanyController;
import com.example.drivewatch.entrypoint.api.dto.CompanyDTO;
import com.example.drivewatch.entrypoint.api.dto.CompanyRequestDTO;
import com.example.drivewatch.entrypoint.api.facade.CompanyFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CompanyControllerImpl implements CompanyController {

    private final CompanyFacade facade;

    @Override
    public CompanyDTO create(CompanyRequestDTO companyRequestDTO) {

        return facade.create(companyRequestDTO);
    }
}
