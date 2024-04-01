package com.example.drivewatch.entrypoint.api.dto;

import java.time.LocalDateTime;

public record RegisterDTO(
    String registerClass,
    String idDevice,
    String idCompany,
    LocalDateTime occurrenceDate,
    String image
) {
}
