package com.haianh123.universal_pet_care.service;

import com.haianh123.universal_pet_care.model.User;
import com.haianh123.universal_pet_care.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;

    public void add(User user) {
        userRepository.save(user);
    }
}
