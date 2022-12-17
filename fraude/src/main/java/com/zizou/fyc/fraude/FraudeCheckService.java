package com.zizou.fyc.fraude;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@AllArgsConstructor
public class FraudeCheckService {
  private final FraudeCheckHistoryRepository fraudeCheckHistoryRepository;


  public boolean isFraudulentClient(Integer clientId) {
    fraudeCheckHistoryRepository.save(
            FraudeCheckHistory.builder()
                    .clientId(clientId)
                    .isFraudster(false)
                    .createdAt(LocalDateTime.now())
                    .build()
    );
    return false;
  }
}
