package com.simpli.SportyShoes.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simpli.SportyShoes.entity.Products;

@Repository
public interface ProductRepository extends CrudRepository<Products, Integer>{

}
