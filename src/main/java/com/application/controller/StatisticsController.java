package com.application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.application.model.*;
import com.application.service.EbookService;

@RestController
@RequestMapping("/statistic")
public class StatisticsController {
	private final EbookService service;

	@Autowired
	public StatisticsController(EbookService service) {
		this.service = service;
	}

	@GetMapping("/query")
	public StatisticResponse queryMonthlyStatistic() {
		StatisticResponse response = new StatisticResponse();
		response = service.queryMonthlyStatistic();
		return response;
	}

	
}
