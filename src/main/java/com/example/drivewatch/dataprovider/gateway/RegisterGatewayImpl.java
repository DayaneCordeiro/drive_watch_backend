package com.example.drivewatch.dataprovider.gateway;

import com.example.drivewatch.core.domain.RegisterDomain;
import com.example.drivewatch.core.gateway.RegisterGateway;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegisterGatewayImpl implements RegisterGateway {

    @Override
    public RegisterDomain get() {
        String test = "3";
        return null;
    }
}
