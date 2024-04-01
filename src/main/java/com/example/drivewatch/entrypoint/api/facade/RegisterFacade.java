package com.example.drivewatch.entrypoint.api.facade;

import com.example.drivewatch.core.usecase.GetRegisterUseCase;
import com.example.drivewatch.entrypoint.api.dto.RegisterDTO;
import com.example.drivewatch.entrypoint.api.mapper.RegisterMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class RegisterFacade {

    private final GetRegisterUseCase getRegisterUseCase;
    private final RegisterMapper mapper;

    public RegisterDTO get() {
        return mapper.toDTO(getRegisterUseCase.get());
    }
}
