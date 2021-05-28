package com.sof303.model;

public class TrustRegionModel extends AbstractModel<TrustRegionModel> {

	private String name;
	private String description;
	private Integer status;
	private Integer countryId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getCountryId() {
		return countryId;
	}

	public void setCountryId(Integer countryId) {
		this.countryId = countryId;
	}

	@Override
	public String toString() {
		return "TrustRegionModel [id" + this.getId() + "name=" + name + ", description=" + description + ", status="
				+ status + ", countryId=" + countryId + "]";
	}
}
