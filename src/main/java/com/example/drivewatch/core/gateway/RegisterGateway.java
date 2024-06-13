package com.example.drivewatch.core.gateway;

import com.example.drivewatch.core.domain.RegisterDomain;

public interface RegisterGateway {

    RegisterDomain create(RegisterDomain registerDomain);

    RegisterDomain get();
}
