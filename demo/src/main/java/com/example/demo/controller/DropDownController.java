package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.DropDown;
import com.example.demo.service.DropDownService;

@RestController
@RequestMapping("/dropDown/api")
public class DropDownController {
	
	DropDownService dropDownService;
	
	public DropDownController(DropDownService dropDownService) {
		this.dropDownService=dropDownService;
	}
	
	@PostMapping
	public ResponseEntity<?> createDropDown(@RequestBody DropDown data){
		DropDown dropDown = dropDownService.create(data);
		return new ResponseEntity<>(dropDown,HttpStatus.CREATED);
	}
	
	@GetMapping
	public ResponseEntity<?> getDropDown(){
		return new ResponseEntity<>(dropDownService.getDropDownData(),HttpStatus.OK);
	}
}
