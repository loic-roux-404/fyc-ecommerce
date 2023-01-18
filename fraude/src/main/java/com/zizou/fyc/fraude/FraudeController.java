package com.zizou.fyc.fraude;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("api/v1/fraude-check")
@AllArgsConstructor
public class FraudeController {

  private final FraudeCheckService fraudeCheckService;

  @GetMapping(path ="{clientId}" )
  public FraudeCheckResponse isFraudster(
          @PathVariable("clientId") Integer clientId) {
    boolean isFraudulentClient = fraudeCheckService.
            isFraudulentClient(clientId);
    log.info("fraud check request for client {}", clientId);
    return new FraudeCheckResponse(isFraudulentClient);

  }

}
