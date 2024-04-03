package com.example.drivewatch.core.domain;

import lombok.Builder;

@Builder
public record CompanyDomain(
    Integer id,
    String name,
    String phoneNumber,
    String address
) {
}
