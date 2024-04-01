package com.example.drivewatch.core.domain;

import lombok.Builder;

import java.time.LocalDateTime;

@Builder
public record RegisterDomain(
    String registerClass,
    String idDevice,
    String idCompany,
    LocalDateTime occurrenceDate,
    String image
) {
}
