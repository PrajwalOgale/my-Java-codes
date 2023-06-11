package com.bank.entity;

public enum AccountType {
	SAVING(500),CURRENT(1000),SALARY(1000),FIXED(10000);
	private Double minDeposit;
	
	private AccountType(double minDeposit) {
		this.minDeposit=minDeposit;
	}

	public double getMinDeposit() {
		return minDeposit;
	}

	public void setMinDeposit(double minDeposit) {
		this.minDeposit = minDeposit;
	}
	
	
	
	
}	


