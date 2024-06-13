package com.example.drivewatch.core.domain;

import lombok.Builder;

import java.time.LocalDate;

@Builder
public record RegisterDomain(
    String id,
    String idDevice,
    String type,
    String image,
    LocalDate occurrenceDate
) {
}
