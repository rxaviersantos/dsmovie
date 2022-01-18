package com.devsuperior.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmove.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);

}
