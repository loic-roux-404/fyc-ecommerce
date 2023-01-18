package com.zizou.fyc.client;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@AllArgsConstructor
public class ClientService {
    private ClientRepository clientRepository;
    private RestTemplate restTemplate;
    public void registerClient(ClientRegistrationRequest request) {
        Client client = Client.builder()
            .lastName(request.lastName())
            .firstName(request.firstName())
            .email(request.email())
            .build();
        // TODO: check if email not taken
        // TODO: check if fraudster
        clientRepository.saveAndFlush(client);
        FraudeCheckResponse fraudeCheckResponse = restTemplate.getForObject(
                "http://localhost:8088/api/v1/fraude-check/{clientId}",
                FraudeCheckResponse.class,
                client.getId()
        );
        System.out.println(client.getId());
        if (fraudeCheckResponse.isFraudster()) {
            throw new IllegalStateException("Client is a fraudster");
        }
        // TODO: send notification

    }

  public void getClient(int id) {
        clientRepository.findById(id);
  }
}
