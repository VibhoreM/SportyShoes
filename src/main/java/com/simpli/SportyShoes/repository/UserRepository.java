package com.simpli.SportyShoes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simpli.SportyShoes.entity.User;

@Repository
public interface UserRepository extends CrudRepository<User, Integer>{
	
	User findByName(String name);

}
