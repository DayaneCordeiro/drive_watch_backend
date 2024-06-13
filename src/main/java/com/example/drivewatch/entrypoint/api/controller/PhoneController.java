package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.PhoneRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.PhoneResponseDTO;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    PhoneResponseDTO get(
        @PathVariable @NotBlank final String id
    );

    @GetMapping("/device/{id}")
    @ResponseStatus(HttpStatus.OK)
    PhoneResponseDTO getByIdDevice(
        @PathVariable @NotBlank final String id
    );

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    PhoneResponseDTO update(
        @PathVariable @NotBlank final String id,
        @Valid @RequestBody final PhoneRequestDTO requestDTO
    );
}
