package com.zizou.fyc.client;

import org.springframework.stereotype.Service;
@Service
public record ClientService() {
    public void registerClient(ClientRegistrationRequest request) {
        Client client = Client.builder()
            .name(request.name())
            .firstName(request.firstName())
            .email(request.email())
            .build();
        // TODO: save client
        // TODO: check if client already exists
        // TODO: store client in database
    }
}
