package com.bunny.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bunny.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long>{
	
}
