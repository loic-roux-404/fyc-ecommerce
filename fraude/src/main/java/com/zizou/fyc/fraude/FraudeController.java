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

  @GetMapping(path ="{customerId}" )
  public FraudeCheckResponse isFraudster(@PathVariable("customerId") Integer clientId) {
    boolean isFraudulentClient = fraudeCheckService.
            isFraudulentClient(clientId);
    return new FraudeCheckResponse(isFraudulentClient);

  }

}
