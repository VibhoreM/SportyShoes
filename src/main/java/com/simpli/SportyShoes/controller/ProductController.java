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

@Controller
public class ProductController {
	
	@Autowired
	ProductService ps;
	
	@Autowired
	CategoryService cs;
	
//	//@GetMapping("/add/product")
//	@RequestMapping(value = "/add/product", method = RequestMethod.POST)
//	public Products Products(int id, String product, Cateory category) {
//		Products p = new Products();
//		p.setId(id);
//		p.setCategory(category);
//		p.setProduct(product);
//		return p;
//	}
	
	@GetMapping("/GetProducts")
	public String getProducts(Model model) {
		model.addAttribute("products", ps.getAllProducts()); //to push an object from controller to view/front end put it as attribute to Model 
		model.addAttribute("categories", cs.getAllCategories());
		return "ManageProduct";// return the name of your Thymeleaf template
		
	}
	
	@PostMapping("/AddProduct")
	public String addProduct(@RequestParam(name="pname") String Product, Products p, @RequestParam(name="cname") String c) {
		
		p.setProduct(Product);
		p.setCategory(c);
		
		ps.saveProduct(p);
		
		return "homepage";
	}
	
	@PostMapping("/DeleteProduct")
	public String deleteProduct(@RequestParam("pid") String id) {
		int pid = Integer.parseInt(id);
		ps.delete(pid);
		return "homepage";
	}
	
}
