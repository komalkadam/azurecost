package com.hitachivantara.multicloud.providercost.azure.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class AzureBillingCostApiResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 430892346344786459L;
	private AzurePropertiesDto properties;
	public AzurePropertiesDto getProperties() {
		return properties;
	}
	public void setProperties(AzurePropertiesDto properties) {
		this.properties = properties;
	}
}
