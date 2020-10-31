package com.example.model;

public class Cpu extends Character{
	public String name = "CPU";
	
	public String showHand() {
		String hand = "";
		double randomNum = Math.random() * 3;	
		if(randomNum < 1) {
			hand = "CPUの手:　グー";
		}else if(randomNum < 2) {
			hand = "CPUの手:　チョキ";
		}else if(randomNum < 3) {
			hand = "CPUの手:　パー";
		}
		
		return hand;
	}
	
	public String getName() {
		return name;
	}
}