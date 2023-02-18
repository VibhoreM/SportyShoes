package com.simpli.SportyShoes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simpli.SportyShoes.entity.Category;

@Repository
public interface CategoryRepository extends CrudRepository<Category, Integer> {

}
