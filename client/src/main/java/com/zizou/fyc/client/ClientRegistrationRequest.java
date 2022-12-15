package com.zizou.fyc.client;

public record ClientRegistrationRequest(
    String name,
    String firstName,
    String email
) {
}
