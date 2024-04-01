package com.tharun.monopoly.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.tharun.monopoly.model.TileContent;
import com.tharun.monopoly.repo.GameRepo;


@Service
public class GameService {
	


	@Autowired
	private GameRepo repo;
	
	
	int p1Cash = 1000;
	int p2Cash = 1000;
	int StartBonus = 200;
	
	public void load() {
		// arrayList to store store JobPost objects
		List<TileContent> tiles = new ArrayList<>(List.of(
				new TileContent(1, "Start", 0, 0),
				new TileContent(2, "Old Kent Road", 60, 30),
				new TileContent(3, "Whitechapel Road", 60, 30),
				new TileContent(4, "King's Cross station", 200, 100),
				new TileContent(5, "The Angel Islington", 100, 50),
				new TileContent(6, "Euston Road", 100, 50),
				new TileContent(7, "Pentonville Road ", 120, 60),
				new TileContent(8, "Pall Mall", 140, 70),
				new TileContent(9, "Whitehall", 140, 70),
				new TileContent(10, "Northumberland Avenue", 160, 80),
				new TileContent(11, "Marylebone station", 200, 100)


		));

		repo.saveAll(tiles);

	}

	public int rolldice() {
		Random rand = new Random();
		int min=1,max=12;
		int randomnum = rand.nextInt(max - min + 1) + min;
		return randomnum;
		
	}

}
