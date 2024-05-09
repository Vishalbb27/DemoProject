package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.DropDown;
import com.example.demo.repository.DropDownRepository;

@Service
public class DropDownServiceImpl implements DropDownService {
	
	DropDownRepository dropDownRepository;
	
	@Autowired
	public DropDownServiceImpl(DropDownRepository dropDownRepository) {
		this.dropDownRepository=dropDownRepository;
	}

	@Override
	public DropDown create(DropDown data) {
		
		dropDownRepository.save(data);
		
		return data;
	}

	@Override
	public List<DropDown> getDropDownData() { 
		return dropDownRepository.findAll();
	}

	@Override
	public DropDown getDropDownById(int id) {
		
		return dropDownRepository.findById(id).get();
	}
}