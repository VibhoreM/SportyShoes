package com.simpli.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simpli.SportyShoes.model.AdminCred;

@Controller
public class WelcomeController {
		
		
	
		@GetMapping("/login")
		public String welcome() {
			
			
		return "login";
		}

}
 