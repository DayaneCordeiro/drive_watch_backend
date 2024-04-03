package com.example.drivewatch.dataprovider.database.mapper;

import com.example.drivewatch.core.domain.CompanyDomain;
import com.example.drivewatch.dataprovider.database.entity.Company;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityMapper {

    Company toEntity(CompanyDomain companyDomain);

    CompanyDomain toDomain(Company company);
}
