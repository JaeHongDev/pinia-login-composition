package com.example.server.domain.user.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Getter
@NoArgsConstructor
@Entity
public class UserEntity {
    @Id
    @Column(name="user_id")
    private String id;

    @Column(name="user_password")
    private String password;

    @Column(name="user_name")
    private String name;

    @Builder
    public UserEntity(String id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
    }
}
