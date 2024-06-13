package com.example.drivewatch.entrypoint.api.facade;

import com.example.drivewatch.core.domain.DeviceDomain;
import com.example.drivewatch.core.usecase.CreateDeviceUseCase;
import com.example.drivewatch.core.usecase.GetDeviceUseCase;
import com.example.drivewatch.entrypoint.api.dto.DeviceRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.DeviceResponseDTO;
import com.example.drivewatch.entrypoint.api.mapper.DeviceMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class DeviceFacade {

    private final DeviceMapper mapper;

    private final CreateDeviceUseCase createDeviceUseCase;

    private final GetDeviceUseCase getDeviceUseCase;

    public DeviceResponseDTO create(DeviceRequestDTO requestDTO) {
        DeviceDomain deviceDomain = mapper.toDomain(requestDTO);

        return mapper.toDto(createDeviceUseCase.create(deviceDomain));
    }

    public DeviceResponseDTO get(String id) {
        return mapper.toDto(getDeviceUseCase.get(id));
    }
}
