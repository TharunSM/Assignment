package com.tharun.monopoly.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//lombok not working

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TileContent {
	@Id
	private int tileNumber;
	private String place;
	private int BuyPrice;
	private int Rent;
	

	@Override
	public String toString() {
		return "JobPost [tileNumber=" + tileNumber + ", place=" + place + ", BuyPrice=" + BuyPrice + ", Rent=" + Rent
				+ "]";
	}
	public int getTileNumber() {
		return tileNumber;
	}
	public void setTileNumber(int tileNumber) {
		this.tileNumber = tileNumber;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public int getBuyPrice() {
		return BuyPrice;
	}
	public void setBuyPrice(int buyPrice) {
		BuyPrice = buyPrice;
	}
	public int getRent() {
		return Rent;
	}
	public void setRent(int rent) {
		Rent = rent;
	}

	
	public TileContent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TileContent(int tileNumber, String place, int buyPrice, int rent) {
		super();
		this.tileNumber = tileNumber;
		this.place = place;
		BuyPrice = buyPrice;
		Rent = rent;
	}


	
	
	
	
	
}
