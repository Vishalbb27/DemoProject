package com.example.demo.controller;


import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.Demo;
import com.example.demo.service.DemoService;

@RestController
@RequestMapping("/demo/api")

public class DemoController {
	
	DemoService demoService;
	
	public DemoController(DemoService demoService) {
		this.demoService=demoService;
	}
	
	@GetMapping
	public ResponseEntity<?> getDetails(){
		List<Demo> demo = demoService.getData();
		return new ResponseEntity<>(demo,HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> createDetails(@RequestBody DemoDTO data){
		Demo demo = demoService.create(data);
		return new ResponseEntity<>(demo,HttpStatus.CREATED);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getDetailsByDropDown(@PathVariable int id){
		List<Demo> demo = demoService.getDataByDropDown(id);
		return new ResponseEntity<>(demo,HttpStatus.OK);
	}
}
