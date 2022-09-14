package com.example.server.domain.auth.repository;

import com.example.server.domain.auth.entity.RefreshTokenEntity;
import com.example.server.domain.user.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;

import javax.swing.text.html.Option;
import java.util.Optional;

public interface RefreshTokenRepository extends JpaRepository<RefreshTokenEntity, String> {
    Optional<RefreshTokenEntity> findByRefreshToken(String token);

    @Modifying
    int deleteByUser(UserEntity user);
}
