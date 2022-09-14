package com.example.server.domain.auth.service;

import com.example.server.domain.auth.entity.RefreshTokenEntity;
import com.example.server.domain.auth.repository.RefreshTokenRepository;
import com.example.server.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class RefreshTokenService {
    private final Long refreshTokenDurationMs = 36000L;
    private final RefreshTokenRepository refreshTokenRepository;
    private final UserRepository userRepository;

    public Optional<RefreshTokenEntity> findByToken(String token){
        return this.refreshTokenRepository.findByRefreshToken(token);
    }
}
