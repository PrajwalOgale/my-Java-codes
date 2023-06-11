package com.bank.entity;

public enum AccountType {
	SAVING(500),CURRENT(1000),SALARY(1000),FIXED(10000);
	private int minDeposit;
	
	private AccountType(int minDeposit) {
		this.minDeposit=minDeposit;
	}

	public int getMinDeposit() {
		return minDeposit;
	}

	public void setMinDeposit(int minDeposit) {
		this.minDeposit = minDeposit;
	}
	
	
	
	
}	


