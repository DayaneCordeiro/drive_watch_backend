package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.DeviceRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.DeviceResponseDTO;
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

@RequestMapping("/api/v1/device")
public interface DeviceController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DeviceResponseDTO create(
        @Valid @RequestBody final DeviceRequestDTO deviceRequestDTO
    );

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    DeviceResponseDTO get(
        @PathVariable @NotBlank final String id
    );

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    DeviceResponseDTO getAll();

    @PutMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    DeviceResponseDTO update(
        @PathVariable @NotBlank final String id,
        @Valid @RequestBody final DeviceRequestDTO deviceRequestDTO
    );
}
