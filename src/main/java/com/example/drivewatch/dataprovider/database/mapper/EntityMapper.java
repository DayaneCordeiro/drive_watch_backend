package com.example.drivewatch.dataprovider.database.mapper;

import com.example.drivewatch.core.domain.AddressDomain;
import com.example.drivewatch.core.domain.CompanyDomain;
import com.example.drivewatch.core.domain.DeviceDomain;
import com.example.drivewatch.dataprovider.database.entity.Address;
import com.example.drivewatch.dataprovider.database.entity.Company;
import com.example.drivewatch.dataprovider.database.entity.Device;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface EntityMapper {

    Company toEntity(CompanyDomain companyDomain);

    CompanyDomain toDomain(Company company);

    List<CompanyDomain> toDomain(List<Company> companies);

    @Mapping(target = "zipcode", source = "zipCode")
    Address toEntity(AddressDomain addressDomain);

    @Mapping(target = "zipCode", source = "zipcode")
    AddressDomain toDomain(Address address);

    Device toEntity(DeviceDomain deviceDomain);

    DeviceDomain toDomain(Device device);
}
