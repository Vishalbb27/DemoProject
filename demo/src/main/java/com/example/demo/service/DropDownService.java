package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.DropDown;

public interface DropDownService {
	public DropDown create(DropDown data);
	
	public List<DropDown> getDropDownData();
	
	public DropDown getDropDownById(int id);
	
}
