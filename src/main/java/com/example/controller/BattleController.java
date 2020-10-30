package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BattleController {
	@GetMapping(value="/html/battle")
	public String GetBattle() {
		return "html/battle";
	}
	
	@PostMapping(value="/html/battle")
	public ModelAndView send(@RequestParam(value="radio1")String radio1, ModelAndView model) {
		String res = "";
		res = "なに出した？     " + radio1;
		model.addObject("msg", res);
		return model;
	}
}
