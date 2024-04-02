package com.tharun.monopoly.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok not working

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PlayerContent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollcount;
	
	
	private String place_owned;
	private int amount_rem;
	
	
	public String getPlace_owned() {
		return place_owned;
	}
	public void setPlace_owned(String place_owned) {
		this.place_owned = place_owned;
	}
	public int getAmount_rem() {
		return amount_rem;
	}
	public void setAmount_rem(int amount_rem) {
		this.amount_rem = amount_rem;
	}
	@Override
	public String toString() {
		return "PlayerContent [rollcount=" + rollcount + ", place_owned=" + place_owned + ", amount_rem=" + amount_rem
				+ "]";
	}
	public PlayerContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PlayerContent(String place_owned, int amount_rem) {
		super();
		this.place_owned = place_owned;
		this.amount_rem = amount_rem;
	}



}
