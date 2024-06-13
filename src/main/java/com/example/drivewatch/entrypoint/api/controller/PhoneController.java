package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.PhoneRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.PhoneResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/v1/phone")
public interface PhoneController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PhoneResponseDTO create(
            @Valid @RequestBody final PhoneRequestDTO requestDTO
    );
}
