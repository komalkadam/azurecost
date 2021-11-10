package com.hitachivantara.multicloud.providercost.azure.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AzureCostColumnsDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3246422289945936359L;
	private String name;
	private String type;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
