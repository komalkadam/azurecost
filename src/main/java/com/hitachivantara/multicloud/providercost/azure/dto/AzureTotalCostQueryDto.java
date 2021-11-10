package com.hitachivantara.multicloud.providercost.azure.dto;

import com.hitachivantara.multicloud.providercost.azure.query.AzureAggregation;
import com.hitachivantara.multicloud.providercost.azure.query.AzureGrouping;

import lombok.Data;

@Data
public class AzureTotalCostQueryDto {

	private String type;
	private String timeframe;
	private AzureQueryTimePeriodDto timePeriod;
	private Dataset dataset;
	
	

	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}



	public String getTimeframe() {
		return timeframe;
	}



	public void setTimeframe(String timeframe) {
		this.timeframe = timeframe;
	}



	public AzureQueryTimePeriodDto getTimePeriod() {
		return timePeriod;
	}



	public void setTimePeriod(AzureQueryTimePeriodDto timePeriod) {
		this.timePeriod = timePeriod;
	}



	public Dataset getDataset() {
		return dataset;
	}



	public void setDataset(Dataset dataset) {
		this.dataset = dataset;
	}



	@Data
	public class Dataset {
		private String granularity;
		private AzureAggregation aggregation;
		private AzureGrouping[] grouping;
		public String getGranularity() {
			return granularity;
		}
		public void setGranularity(String granularity) {
			this.granularity = granularity;
		}
		public AzureAggregation getAggregation() {
			return aggregation;
		}
		public void setAggregation(AzureAggregation aggregation) {
			this.aggregation = aggregation;
		}
		public AzureGrouping[] getGrouping() {
			return grouping;
		}
		public void setGrouping(AzureGrouping[] grouping) {
			this.grouping = grouping;
		}
	}
	

	
	
}
