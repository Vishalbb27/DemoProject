package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class DropDown {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String details;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public DropDown(int id, String details) {
		super();
		this.id = id;
		this.details = details;
	}
	public DropDown() {
		super();
	}
	@Override
	public String toString() {
		return "DropDown [id=" + id + ", details=" + details + "]";
	}

}
