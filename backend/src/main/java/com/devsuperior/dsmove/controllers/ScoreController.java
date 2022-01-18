package com.devsuperior.dsmove.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dsmove.dto.MovieDTO;
import com.devsuperior.dsmove.dto.ScoreDTO;
import com.devsuperior.dsmove.services.ScoreService;

@RestController
@RequestMapping(value = "/scores")
public class ScoreController {
	

	@Autowired
	private ScoreService service;
	
	@PutMapping
	public MovieDTO saveScore(@RequestBody ScoreDTO dto){
		MovieDTO MovieDTO = service.saveScore(dto);
		return MovieDTO;		
	}


}