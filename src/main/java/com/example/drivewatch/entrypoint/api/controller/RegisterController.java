package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.RegisterRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.RegisterResponseDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;

@RequestMapping("/api/v1/register")
public interface RegisterController {

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    RegisterResponseDTO create(
        @Valid @RequestBody final RegisterRequestDTO requestDTO
    );

    @GetMapping
    RegisterResponseDTO get();
}
