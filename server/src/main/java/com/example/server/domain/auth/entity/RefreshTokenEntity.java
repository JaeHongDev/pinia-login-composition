package com.example.server.domain.auth.entity;

import com.example.server.domain.user.entity.UserEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.Instant;

@NoArgsConstructor
@Getter
@Entity
public class RefreshTokenEntity {

    @Id
    private String id;

    @MapsId
    @JoinColumn(name="user_id")
    @OneToOne
    private UserEntity user;

    private String accessToken;

    @Column(unique = true)
    private String refreshToken;

    @Column(nullable = false)
    private Instant accessTokenExpiryDate;

    @Column(nullable = false)
    private Instant refreshTokenExpiryDate;
}
