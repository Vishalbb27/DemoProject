package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Demo;
import com.example.demo.entity.DropDown;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Integer> {
	List<Demo> findByDropDown(DropDown dropDown);
}
