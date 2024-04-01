package com.tharun.monopoly.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tharun.monopoly.model.TileContent;



@Repository
public interface GameRepo extends JpaRepository<TileContent, Integer> {



}
	
