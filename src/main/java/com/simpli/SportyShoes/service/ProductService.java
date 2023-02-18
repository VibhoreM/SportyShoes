package com.simpli.SportyShoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.SportyShoes.entity.Category;
import com.simpli.SportyShoes.entity.Products;
import com.simpli.SportyShoes.repository.CategoryRepository;
import com.simpli.SportyShoes.repository.ProductRepository;


@Service
public class ProductService {
	
	@Autowired
	ProductRepository p;
	
	public void saveProduct(Products product) {
		p.save(product);
	}
	
	public List<Products> getAllProducts() {
		List<Products> products = new ArrayList<Products>();
		p.findAll().forEach(product -> products.add(product));
		return products;
	}
	
	public void delete(int id) {
		p.deleteById(id);
	}
	
}
