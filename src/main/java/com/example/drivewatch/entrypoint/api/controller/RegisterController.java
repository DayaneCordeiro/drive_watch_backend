package com.example.drivewatch.entrypoint.api.controller;

import com.example.drivewatch.entrypoint.api.dto.RegisterDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/register")
public interface RegisterController {

    @GetMapping
    RegisterDTO get();
}
