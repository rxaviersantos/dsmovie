package com.devsuperior.dsmove.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmove.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
