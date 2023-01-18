package com.zizou.fyc.client;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/clients")
@AllArgsConstructor
public class ClientController{
    private final ClientService clientService;
    @PostMapping
    public void RegisterClient(@RequestBody ClientRegistrationRequest clientRegistrationRequest) {
        log.info("RegisterClient", clientRegistrationRequest);
        clientService.registerClient(clientRegistrationRequest);
    }
    @GetMapping
    public void GetClient(@RequestParam("id") int id) {
        log.info("GetClient", id);
        clientService.getClient(id);
    }
}
