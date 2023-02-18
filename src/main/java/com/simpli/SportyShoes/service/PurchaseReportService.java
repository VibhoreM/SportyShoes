package com.simpli.SportyShoes.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simpli.SportyShoes.entity.PurchaseReport;
import com.simpli.SportyShoes.repository.PurchaseReportRepository;

@Service
public class PurchaseReportService {
	
	@Autowired
	PurchaseReportRepository pr;
	
	public List<PurchaseReport> find(String date, String category){
		List<PurchaseReport> report = new ArrayList<PurchaseReport>();
		pr.findByDateAndCategory(date, category).forEach(entry -> report.add(entry));;
		return report;
	}
	
	public List<PurchaseReport> findAll(){
		List<PurchaseReport> report = new ArrayList<PurchaseReport>();
		pr.findAll().forEach(entry -> report.add(entry));;
		return report;
	}
	
}
