package com.hitachivantara.multicloud.providercost.azure.dto;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class AzurePropertiesDto implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 3637863051052553957L;
	private String nextLink;
	private List<AzureCostColumnsDto> columns;
	private Object[] rows;
	public String getNextLink() {
		return nextLink;
	}
	public void setNextLink(String nextLink) {
		this.nextLink = nextLink;
	}
	public List<AzureCostColumnsDto> getColumns() {
		return columns;
	}
	public void setColumns(List<AzureCostColumnsDto> columns) {
		this.columns = columns;
	}
	public Object[] getRows() {
		return rows;
	}
	public void setRows(Object[] rows) {
		this.rows = rows;
	}
}
