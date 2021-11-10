package com.hitachivantara.multicloud.providercost.azure.dto;

import lombok.Data;

@Data
public class AzureQueryTimePeriodDto {

	private String from;
	private String to;
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
}
