package com.example.drivewatch.entrypoint.api.mapper;

import com.example.drivewatch.core.domain.RegisterDomain;
import com.example.drivewatch.entrypoint.api.dto.RegisterDTO;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring", unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface RegisterMapper {

    RegisterDTO toDTO(RegisterDomain registerDomain);
}
