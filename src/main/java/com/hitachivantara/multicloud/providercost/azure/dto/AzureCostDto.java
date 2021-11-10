package com.hitachivantara.multicloud.providercost.azure.dto;

import lombok.Data;

@Data
public class AzureCostDto {

	private String serviceName;
	private String region;
	private Integer usageDate;
	private Double cost;
	private String subscriptionName;
	private String pricingModel;
	public String getServiceName() {
		return serviceName;
	}
	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public Integer getUsageDate() {
		return usageDate;
	}
	public void setUsageDate(Integer usageDate) {
		this.usageDate = usageDate;
	}
	public Double getCost() {
		return cost;
	}
	public void setCost(Double cost) {
		this.cost = cost;
	}
	public String getSubscriptionName() {
		return subscriptionName;
	}
	public void setSubscriptionName(String subscriptionName) {
		this.subscriptionName = subscriptionName;
	}
	public String getPricingModel() {
		return pricingModel;
	}
	public void setPricingModel(String pricingModel) {
		this.pricingModel = pricingModel;
	}
}
