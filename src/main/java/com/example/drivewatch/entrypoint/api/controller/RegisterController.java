package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.RegisterRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.RegisterResponseDTO;
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

import java.util.List;

@RequestMapping("/api/v1/register")
public interface RegisterController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    RegisterResponseDTO create(
        @Valid @RequestBody final RegisterRequestDTO requestDTO
    );

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    RegisterResponseDTO get(
        @PathVariable @NotBlank final String id
    );

    @GetMapping("/device/{id}")
    @ResponseStatus(HttpStatus.OK)
    List<RegisterResponseDTO> getAllByIdDevice(
        @PathVariable @NotBlank final String id
    );

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    List<RegisterResponseDTO> getAll();

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    RegisterResponseDTO update(
        @PathVariable @NotBlank final String id,
        @Valid @RequestBody final RegisterRequestDTO requestDTO
    );
}
