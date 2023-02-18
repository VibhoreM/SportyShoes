package com.simpli.SportyShoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.SportyShoes.entity.Category;
import com.simpli.SportyShoes.repository.CategoryRepository;


@Service
public class CategoryService {
	
	@Autowired
	CategoryRepository c;
	
	public void saveCategory(Category category) {
		c.save(category);
	}
	
	public List<Category> getAllCategories() {
		List<Category> categories = new ArrayList<Category>();
		c.findAll().forEach(category -> categories.add(category));
		return categories;
	}
	
	public void delete(int id) {
		c.deleteById(id);
	}
	
}
