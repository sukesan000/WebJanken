package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.model.Character;
import com.example.model.Cpu;

@Controller
public class BattleController {
	@GetMapping(value="/html/battle")
	public String GetBattle() {
		return "html/battle";
	}
	
	@PostMapping(value="/html/battle")
	public String send(@RequestParam(value="radio1")String radio1, Model model) {
		Character cpu = new Cpu();
		String playerHand = "";
		String cpuHand = "";
		cpuHand = cpu.showHand();
		playerHand = "あなたの手: " + radio1; 
		
		model.addAttribute("playerHand", playerHand);
		model.addAttribute("cpuHand", cpuHand);
		return "/html/battle";
	}
}
