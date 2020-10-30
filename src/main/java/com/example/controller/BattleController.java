package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class BattleController {
	@RequestMapping(value="/html/battle", method=RequestMethod.GET)
	public String GetBattle() {
		return "html/battle";
	}
	
//	@RequestMapping(value = "/battle", method = RequestMethod.POST)
//	  public ModelAndView send(@RequestParam(value="radio1",required=false)String radio1, Model mav) {
//	   
//	    return "html/battle";
//	  }
}
