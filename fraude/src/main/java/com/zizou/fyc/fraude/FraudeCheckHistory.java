package com.zizou.fyc.fraude;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.GenerationType;
import java.time.LocalDateTime;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class FraudeCheckHistory {
  @Id
  @SequenceGenerator(
          name = "fraude_id_sequence",
          sequenceName = "fraude_id_sequence"
  )
  @GeneratedValue(
          strategy = GenerationType.SEQUENCE,
          generator = "fraude_id_sequence"
  )
  private Integer id;
  private Integer clientId;
  private Boolean isFraudster;
  private LocalDateTime createdAt;
}
