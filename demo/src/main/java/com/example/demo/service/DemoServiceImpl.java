package com.example.demo.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.DemoDTO;
import com.example.demo.entity.Demo;
import com.example.demo.entity.DropDown;

import org.modelmapper.ModelMapper;
import com.example.demo.repository.DemoRepository;

@Service
public class DemoServiceImpl implements DemoService {
	
	DemoRepository demoRepository;
	DropDownService dropDownService;
	
	@Autowired
	public DemoServiceImpl(DemoRepository demoRepository,DropDownService dropDownService) {
		this.demoRepository=demoRepository;
		this.dropDownService=dropDownService;
	}
	
	private Demo assignmentDtoToModel(DemoDTO demoDTO){
        ModelMapper mapper = new ModelMapper();
        Demo demo = mapper.map(demoDTO, Demo.class);
        DropDown dropDown = dropDownService.getDropDownById(demoDTO.getDropDown());
        demo.setDropDown(dropDown);
        
        return demo	;
    }
		
	@Override
	public Demo create(DemoDTO details ) {
		Demo demo = this.assignmentDtoToModel(details);
		Demo getDemo = demoRepository.save(demo);
		return getDemo;
	}

	@Override
	public List<Demo> getData() {
		
		return demoRepository.findAll();
	}

	@Override
	public Demo getDataById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Demo> getDataByDropDown(int id) {
		DropDown dropDown = dropDownService.getDropDownById(id);
		List<Demo> demo = demoRepository.findByDropDown(dropDown);
		return demo;
	}
	
	

}
