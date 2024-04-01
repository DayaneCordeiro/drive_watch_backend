package com.example.drivewatch.dataprovider.client;

import com.example.drivewatch.core.domain.RegisterDomain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

@Component
public class RegisterClient extends Client {

    @Autowired
    private final WebClient webClient;

    public RegisterClient() {
        this.webClient = super.webClient();
    }

    public RegisterDomain get() {

        String test = "4";

        return webClient.get()
            .uri("/register")
            .retrieve()
            .bodyToMono(RegisterDomain.class)
            .block();
    }
}
