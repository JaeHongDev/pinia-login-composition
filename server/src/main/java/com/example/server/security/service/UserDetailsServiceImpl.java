package com.example.server.security.service;

import com.example.server.domain.user.entity.UserEntity;
import com.example.server.domain.user.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@RequiredArgsConstructor
@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    @Transactional
    public UserDetails loadUserByUsername(String id) throws UsernameNotFoundException{
        UserEntity user = this.userRepository.findById(id)
                .orElseThrow(()-> new UsernameNotFoundException("User did not exists" ));
        return UserDetailsImpl.build(user);
    }
}
