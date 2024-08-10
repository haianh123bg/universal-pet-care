package com.haianh123.universal_pet_care.repository;

import com.haianh123.universal_pet_care.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
