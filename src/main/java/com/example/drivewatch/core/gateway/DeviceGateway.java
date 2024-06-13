package com.example.drivewatch.core.gateway;

import com.example.drivewatch.core.domain.DeviceDomain;

public interface DeviceGateway {

    DeviceDomain create(DeviceDomain deviceDomain);

    DeviceDomain get(String id);
}
