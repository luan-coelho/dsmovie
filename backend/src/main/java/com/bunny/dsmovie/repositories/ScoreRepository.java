package com.bunny.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bunny.dsmovie.entities.Score;
import com.bunny.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK>{
	
}
