package com.simpli.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simpli.SportyShoes.model.AdminCred;

@Controller
public class LoginVerifyController {
	
	@Autowired
	AdminCred a;
	
	@PostMapping("/LoginVerify")
	public String veriy(Model model, @RequestParam(name="uname") String username, @RequestParam(name = "pwd") String password) {
		boolean verify = false;
		verify = a.verify(username, password);
		if(verify) {
			return "homepage";
		}
		else {
			return "login_try_again";
		}
	}

}
