package com.tharun.monopoly.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tharun.monopoly.service.GameService;



@RestController
@RequestMapping("roll-die")
public class PlayerController {
	
	@Autowired
	GameService service;
	

	@GetMapping("p1")
	public String player1Move() {
		int diceno = service.rolldice();
		return "";
	}
	
	@GetMapping("p2")
	public String player2Move() {
		int diceno = service.rolldice();
		return "success";
	}

	
}
