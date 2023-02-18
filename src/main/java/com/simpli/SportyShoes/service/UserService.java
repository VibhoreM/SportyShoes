package com.simpli.SportyShoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.SportyShoes.entity.User;
import com.simpli.SportyShoes.repository.UserRepository;

@Service
public class UserService {
	
	
	@Autowired
	UserRepository u;
	
	
	public void saveUser(User user) {
		u.save(user);
	}
	
	public List<User> getAllUsers(){
		List<User> users = new ArrayList<User>();
		u.findAll().forEach(User -> users.add(User));
		return users;
	}
	
	public void delete(User user) {
		u.delete(user);
	}
	
	public User getUsers(String name){
		User user = u.findByName(name);
		return user;
	} 
	
}
