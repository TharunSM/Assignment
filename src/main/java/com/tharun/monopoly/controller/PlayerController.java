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
	
	private static int p1StartAmount;
	private static int p2StartAmount;
	
	public static int getP1StartAmount() {
		return p1StartAmount;
	}

	public static void setP1StartAmount(int p1StartAmount) {
		PlayerController.p1StartAmount = p1StartAmount;
	}

	public static int getP2StartAmount() {
		return p2StartAmount;
	}

	public static void setP2StartAmount(int p2StartAmount) {
		PlayerController.p2StartAmount = p2StartAmount;
	}


	@Autowired
	GameService service;
	

	@GetMapping("p1")
	public String player1Move() {
		int diceno = service.rolldice();
		String place=null;
		boolean placeinp2db=true;
		if(placeinp2db==false) {
			return  "Die rolled "+diceno+" and landed on Place "+place+",Unclaimed place and hence bought for $200. Remaining balance is $800";
		}else {
			return " Die rolled "+diceno+" and landed on Place "+place+", paid rent $100. Remaining balance is $700.";
		}
		
	}
	
	@GetMapping("p2")
	public String player2Move() {
		int diceno = service.rolldice();
		return "success";
	}

	
}
