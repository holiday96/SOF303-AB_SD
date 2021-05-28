package com.sof303.model;

public class CountryModel extends AbstractModel<CountryModel> {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "CountryModel [id=" + this.getId() + "name=" + name + "]";
	}

}
