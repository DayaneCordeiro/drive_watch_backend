package com.example.drivewatch.entrypoint.api.facade;

import com.example.drivewatch.core.domain.PhoneDomain;
import com.example.drivewatch.core.usecase.CreatePhoneUseCase;
import com.example.drivewatch.entrypoint.api.dto.PhoneRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.PhoneResponseDTO;
import com.example.drivewatch.entrypoint.api.mapper.PhoneMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class PhoneFacade {

    private final PhoneMapper mapper;

    private final CreatePhoneUseCase createPhoneUseCase;

    public PhoneResponseDTO create(PhoneRequestDTO requestDTO) {
        PhoneDomain phoneDomain = mapper.toDomain(requestDTO);

        return mapper.toDto(createPhoneUseCase.create(phoneDomain));
    }
}
