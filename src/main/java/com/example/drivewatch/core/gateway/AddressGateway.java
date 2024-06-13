package com.example.drivewatch.core.gateway;

import com.example.drivewatch.core.domain.AddressDomain;

public interface AddressGateway {

    AddressDomain create(AddressDomain addressDomain);

    AddressDomain getByCompanyId(String id);
}
