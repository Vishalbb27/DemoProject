package com.example.demo.dto;

public class DemoDTO {
	private int id;
	private String contactNumber;
	private String description;
	private int amount;
	private String latestActivity;
	private String vendor;
	private String commodityCode;
	private int dropDown;
	public int getDropDown() {
		return dropDown;
	}
	public void setDropDown(int dropDown) {
		this.dropDown = dropDown;
	}
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
	public String getLatestActivity() {
		return latestActivity;
	}
	public void setLatestActivity(String latestActivity) {
		this.latestActivity = latestActivity;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public DemoDTO(int id, String contactNumber, String description, int amount, String latestActivity, String vendor,
			String commodityCode,int dropDown) {
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
	@Override
	public String toString() {
		return "DemoDTO [id=" + id + ", contactNumber=" + contactNumber + ", description=" + description + ", amount="
				+ amount + ", latestActivity=" + latestActivity + ", vendor=" + vendor + ", commodityCode="
				+ commodityCode + "]";
	}
	public DemoDTO() {
		super();
	}
	
	
}
