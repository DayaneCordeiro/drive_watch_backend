package com.example.drivewatch.core.usecase.impl;

import com.example.drivewatch.core.domain.CompanyDomain;

public interface GetCompanyUseCase {

    public CompanyDomain get(String id);
}
