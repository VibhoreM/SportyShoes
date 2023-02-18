package com.simpli.SportyShoes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simpli.SportyShoes.entity.Category;
import com.simpli.SportyShoes.service.CategoryService;

@Controller
public class CategoryController {
	
	
	
	@Autowired
	CategoryService cs;
	
	@GetMapping("/ManageCategory")
	public String manageCategory() {
		return "ManageCategory";
	}
	
	@PostMapping("/AddCategory")
	public String addCategory(@RequestParam(name="cname") String categoryName, Category c) {
		
		c.setCategoryName(categoryName);
		
		cs.saveCategory(c);
		
		return "homepage";
	}
	
	@GetMapping("/GetCategory")
	public String getCategory(Model model) {
		model.addAttribute("categories", cs.getAllCategories()); //to push an object from controller to view/front end put it as attribute to Model 
		return "ManageCategory";// return the name of your Thymeleaf template
		
	}
	
	@PostMapping("/DeleteCategory")
	public String deleteCategory(@RequestParam("cid") String id) {
		int cid = Integer.parseInt(id);
		cs.delete(cid);
		return "homepage";
	}
	
}
