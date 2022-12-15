package com.zizou.fyc.client;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Client {
    private Integer id;
    private String name;
    private String firstName;
    private String email;
}
