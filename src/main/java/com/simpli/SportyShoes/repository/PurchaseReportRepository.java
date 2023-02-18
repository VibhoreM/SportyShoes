package com.simpli.SportyShoes.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.simpli.SportyShoes.entity.PurchaseReport;

@Repository
public interface PurchaseReportRepository extends CrudRepository<PurchaseReport, Integer>{
	
	public List<PurchaseReport> findByDate(String date);
	public List<PurchaseReport> findByCategory(String category);
	
	public List<PurchaseReport> findByDateAndCategory(String date, String category);

}
