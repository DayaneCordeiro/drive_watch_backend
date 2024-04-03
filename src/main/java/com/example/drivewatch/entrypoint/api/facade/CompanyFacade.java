package com.example.drivewatch.entrypoint.api.facade;

import com.example.drivewatch.core.domain.CompanyDomain;
import com.example.drivewatch.core.usecase.CreateCompanyUseCase;
import com.example.drivewatch.entrypoint.api.dto.CompanyDTO;
import com.example.drivewatch.entrypoint.api.dto.CompanyRequestDTO;
import com.example.drivewatch.entrypoint.api.mapper.CompanyMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class CompanyFacade {

    private final CompanyMapper companyMapper;

    private final CreateCompanyUseCase createCompanyUseCase;

    public CompanyDTO create(String userId, CompanyRequestDTO companyDTO) {
        CompanyDomain companyDomain = companyMapper.toDomain(companyDTO);

        return companyMapper.toDto(createCompanyUseCase.create(companyDomain));
    }
}
