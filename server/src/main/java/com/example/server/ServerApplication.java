package com.example.server;

import com.example.server.domain.user.entity.UserEntity;
import com.example.server.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.security.crypto.password.PasswordEncoder;

@RequiredArgsConstructor
@EnableJpaAuditing
@SpringBootApplication
public class ServerApplication implements CommandLineRunner {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    public static void main(String[] args) {
        SpringApplication.run(ServerApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        var newUser = UserEntity.builder().id("1234")
                .password(passwordEncoder.encode("1234"))
                .name("name")
                .build();
        this.userRepository.save(newUser);
    }
}
