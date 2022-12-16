package com.zizou.fyc.client;

import org.springframework.stereotype.Service;
@Service
public record ClientService(ClientRepository clientRepository) {
    public void registerClient(ClientRegistrationRequest request) {
        Client client = Client.builder()
            .lastName(request.lastName())
            .firstName(request.firstName())
            .email(request.email())
            .build();
        // TODO: save client
        // TODO: check if email not taken
        clientRepository.save(client);
    }
}
