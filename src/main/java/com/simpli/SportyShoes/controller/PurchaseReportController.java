package com.simpli.SportyShoes.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.simpli.SportyShoes.entity.PurchaseReport;
import com.simpli.SportyShoes.service.PurchaseReportService;

@Controller
public class PurchaseReportController {
	
	@Autowired
	PurchaseReportService prs;
	
	@PostMapping("/getReport")
	public String getReport(@RequestParam(name = "date") String date, @RequestParam(name = "category") String category, Model model) {
		model.addAttribute("report", prs.find(date, category));
		return "report";
	}
	
	@GetMapping("/getReportParameters")
	public String getReportParameters(Model model) {
		List<PurchaseReport> report = prs.findAll();
		model.addAttribute("report", report);
		
		List<String> categories = new ArrayList<String>();
		report.forEach(entry -> categories.add(entry.getCategory()));
		List<String> unique_categories = categories.stream().distinct().toList();
		model.addAttribute("categories", unique_categories);
		
		return "getreportparameters";
	}
		
	
}
