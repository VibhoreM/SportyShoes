package com.simpli.SportyShoes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.simpli.SportyShoes.entity.*;
import com.simpli.SportyShoes.service.CategoryService;
import com.simpli.SportyShoes.service.ProductService;
import com.simpli.SportyShoes.service.UserService;

@Controller
public class UserController {
	
	@Autowired
	UserService us;
	
	
	@GetMapping("/GetUsers")
	public String getUsers(Model model) {
		model.addAttribute("users", us.getAllUsers()); //to push an object from controller to view/front end put it as attribute to Model 
		
		return "ManageUser";// return the name of your Thymeleaf template
		
	}
	
	@PostMapping("/AddUser")
	public String addProduct(User u, @RequestParam(name="username") String username, @RequestParam(name="name") String name, @RequestParam(name = "pwd") String pwd) {
		
		u.setName(name);
		u.setPassword(pwd);
		u.setUsername(username);
		
		us.saveUser(u);
		
		return "homepage";
	}
	
	@PostMapping("/DeleteUser")
	public String deleteUser(@RequestParam("name") String name) {
		User u = us.getUsers(name);
		us.delete(u);
		return "homepage";
	}
	
	@PostMapping("/FindUser")
	public String findUser(@RequestParam("fname") String name, Model model) {
		User u = us.getUsers(name);
//		model.addAttribute("rusers", u);
		model.addAttribute("r_username", u.getUsername());
		model.addAttribute("r_name", u.getName());
		return "FindUser";
	}
	
}
