package com.example.drivewatch.entrypoint.api.facade;

import com.example.drivewatch.core.domain.AddressDomain;
import com.example.drivewatch.core.usecase.CreateAddressUseCase;
import com.example.drivewatch.entrypoint.api.dto.AddressRequestDTO;
import com.example.drivewatch.entrypoint.api.dto.AddressResponseDTO;
import com.example.drivewatch.entrypoint.api.mapper.AddressMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class AddressFacade {

    private final AddressMapper mapper;

    private final CreateAddressUseCase createAddressUseCase;

    public AddressResponseDTO create(AddressRequestDTO requestDTO) {
        AddressDomain addressDomain = mapper.toDomain(requestDTO);

        return mapper.toDto(createAddressUseCase.create(addressDomain));
    }
}
