package com.zizou.fyc.client;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Slf4j
@RestController
@RequestMapping("api/v1/client")
@AllArgsConstructor
public class ClientController{
    private final ClientService clientService;
    @PostMapping
    public void RegisterClient(@RequestBody ClientRegistrationRequest clientRegistrationRequest) {
        log.info("RegisterClient", clientRegistrationRequest);
        clientService.registerClient(clientRegistrationRequest);
    }
}
