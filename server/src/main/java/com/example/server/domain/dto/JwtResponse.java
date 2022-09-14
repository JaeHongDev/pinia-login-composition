package com.example.server.domain.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class JwtResponse {

    private String token;
    private String type="Bearer";
    private String refreshToken;
    private String userid;
    private String username;

    @Builder
    public JwtResponse(String token, String refreshToken, String userid, String username) {
        this.token = token;
        this.refreshToken = refreshToken;
        this.userid = userid;
        this.username = username;
    }
}
