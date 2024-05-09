package com.example.demo.service;

import java.util.List;


import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.Demo;

public interface DemoService {
	public Demo create(DemoDTO data);
	
	public List<Demo> getData();
	
	public Demo getDataById(int id);
	
	public List<Demo> getDataByDropDown(int id);
	
}
