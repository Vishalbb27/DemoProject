package com.example.demo.entity;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Demo {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int id;
	private String contactNumber;
	private String description;
	private int amount;
	private String latestActivity;
	private String vendor;
	private String commodityCode;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@OnDelete(action = OnDeleteAction.CASCADE)
	private DropDown dropDown;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public DropDown getDropDown() {
		return dropDown;
	}
	public void setDropDown(DropDown dropDown) {
		this.dropDown = dropDown;
	}
	public String getlatestActivity() {
		return latestActivity;
	}
	public void setlatestActivity(String latestActivity) {
		this.latestActivity = latestActivity;
	}
	public String getvendor() {
		return vendor;
	}
	public void setvendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public Demo(int id, String contactNumber, String description, int amount, String latestActivity,
			String vendor, String commodityCode,DropDown dropDown) {
		super();
		this.id = id;
		this.contactNumber = contactNumber;
		this.description = description;
		this.amount = amount;
		this.latestActivity = latestActivity;
		this.vendor = vendor;
		this.commodityCode = commodityCode;
		this.dropDown=dropDown;
	}
	public Demo() {
		super();
	}
	@Override
	public String toString() {
		return "Demo [id=" + id + ", contactNumber=" + contactNumber + ", description=" + description + ", amount="
				+ amount + ", latestActivity=" + latestActivity + ", vendor=" + vendor + ", commodityCode="
				+ commodityCode + "]";
	}
	
	
}
