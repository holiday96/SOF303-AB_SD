package com.sof303.model;

public class OrganisationModel extends AbstractModel<OrganisationModel>{
	private String name;
	private String address;
	private int postCode;
	private int contact;
	
	public OrganisationModel(String name, String address, int postCode, int contact) {
		super();
		this.name = name;
		this.address = address;
		this.postCode = postCode;
		this.contact = contact;
	}
	
	
	public OrganisationModel() {
		super();
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPostCode() {
		return postCode;
	}
	public void setPostCode(int postCode) {
		this.postCode = postCode;
	}
	public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
}
