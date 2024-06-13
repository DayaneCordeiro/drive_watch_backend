package com.example.drivewatch.entrypoint.api.facade;

import com.example.drivewatch.core.domain.RegisterDomain;
import com.example.drivewatch.core.usecase.CreateRegisterUseCase;
import com.example.drivewatch.core.usecase.GetRegisterUseCase;
import com.example.drivewatch.entrypoint.api.dto.RegisterRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.RegisterResponseDTO;
import com.example.drivewatch.entrypoint.api.mapper.RegisterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RegisterFacade {

    private final RegisterMapper mapper;

    private final GetRegisterUseCase getRegisterUseCase;

    private final CreateRegisterUseCase createRegisterUseCase;


    public RegisterResponseDTO create(RegisterRequestDTO requestDTO) {
        RegisterDomain registerDomain = mapper.toDomain(requestDTO);

        return mapper.toDTO(createRegisterUseCase.create(registerDomain));
    }

    public RegisterResponseDTO get() {

        return mapper.toDTO(getRegisterUseCase.get());
    }
}
