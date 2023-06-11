package com.app.entity;

public enum Department {
	HR(4),IT(8), SALES(5);
	
	private Integer maxEmployee;
	
	private Department(Integer maxEmployee) {
		this.maxEmployee=maxEmployee;
	}

	public Integer getMaxEmployee() {
		return maxEmployee;
	}

	public void setMaxEmployee(Integer maxEmployee) {
		this.maxEmployee = maxEmployee;
	}
}
