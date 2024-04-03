package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.CompanyDTO;
import com.example.drivewatch.entrypoint.api.dto.CompanyRequestDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/v1/company")
public interface CompanyController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CompanyDTO create(
        @RequestHeader(value = "user-id") final String userId,
        @Valid @RequestBody final CompanyRequestDTO companyRequestDTO
    );
}
