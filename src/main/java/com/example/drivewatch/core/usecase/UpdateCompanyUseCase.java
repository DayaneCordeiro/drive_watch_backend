package com.example.drivewatch.core.usecase;

import com.example.drivewatch.core.domain.CompanyDomain;

public interface UpdateCompanyUseCase {

    public CompanyDomain update(String id, CompanyDomain companyDomain);
}
