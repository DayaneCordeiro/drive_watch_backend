package com.example.drivewatch.dataprovider.gateway;

import com.example.drivewatch.core.domain.RegisterDomain;
import com.example.drivewatch.core.gateway.RegisterGateway;
import com.example.drivewatch.dataprovider.client.RegisterClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class RegisterGatewayImpl implements RegisterGateway {

    private final RegisterClient client;

    @Override
    public RegisterDomain get() {
        String test = "3";
        return client.get();
    }
}
