package com.example.drivewatch.entrypoint.api.dto;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record RegisterResponseDTO(
    String id,
    String idDevice,
    String type,
    String image,
    LocalDate occurrenceDate
) {
}
