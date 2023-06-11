package com.bank.entity;

import java.time.LocalDate;

public class BankAccount implements Comparable<BankAccount> {
	private Double accountBalance;
	private Integer accountNumber;
	private String customerName;
	private AccountType accountType;
	private LocalDate accountOpeningDate;
	private Integer pin;
	
	
	public BankAccount(int accountNumber, double accountBalance, String customerName, AccountType accountType, int pin) {
		super();
		this.accountBalance = accountBalance;
		this.accountNumber = accountNumber;
		this.customerName = customerName;
		this.accountType = accountType;
		this.accountOpeningDate = LocalDate.now();
		this.pin=pin;
	}

	public BankAccount(int accountNumber, int pin) {
		super();
		this.accountNumber = accountNumber;
		this.pin=pin;
	}
	public BankAccount(int accountNumber) {
		super();
		this.accountNumber = accountNumber;
	}

	
	
	public double getBalance() {
		return accountBalance;
	}
	
	public void creditAmount(int amount) 
	{
		accountBalance+=amount;
		System.out.println("Amount Credited"+amount);
	}
	
	public void debitAmount(int amountToDebit) throws  MinBalanceException{
		
		if(accountBalance-amountToDebit<this.accountType.getMinDeposit()) {
			throw new MinBalanceException("Minimum balance should be "+this.accountType.getMinDeposit());
		}
		accountBalance-=amountToDebit;
		System.out.println("Amount debited. Current balance: "+accountBalance);
	}
	
	
	public boolean fundsTransfer(BankAccount account, int amount ) throws MinBalanceException {
		if(this.accountBalance<=this.accountType.getMinDeposit()) {
			throw new MinBalanceException("Maintain "+this.accountType.getMinDeposit()+" rupees as min balance. Can not transfer amount.");
		}
		this.debitAmount(amount);
		account.creditAmount(amount);
		return true;
	}
	
	public boolean isAccountPresent(BankAccount b) {
		if(this.accountNumber==b.accountNumber) {
			return true;
		}
		return false;
	}
	
	public int getAccountNumber() {
		return this.accountNumber;
	}
	
	public int getPin() {
		return this.pin;
	}
	
	public BankAccount getAccountForNumber(int accnumb) {
		return (this.accountNumber==accnumb)? this:null;
	}
	
	@Override
	public boolean equals(Object o) {
		if(o instanceof BankAccount) {
			return this.accountNumber.equals(((BankAccount)o).accountNumber);
		}
		return false;
	}
	
	public int compareTo(BankAccount b) {
			return this.accountNumber.compareTo(b.accountNumber);
	}
	
	

	@Override
	public String toString() {
		return "BankAccount [accountBalance=" + accountBalance + ", accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", accountType=" + accountType+" Opening Date= "+ this.accountOpeningDate+"]";
	}
}
