package com.bank.entity;

import java.time.LocalDate;

import com.utility.MinBalanceException;

public class BankAccount {
	private Double accountBalance;
	private Integer accountNumber;
	private static int counter;
	private String customerName;
	private AccountType accountType;
	private LocalDate accountOpeningDate;
	private Integer pin;
	
	static {
		counter = 10001;
	}
	public BankAccount(double accountBalance, String customerName, AccountType accountType, int pin) throws MinBalanceException {
		super();
		this.accountBalance = this.checkMinDeposit(accountBalance);
		this.accountNumber = counter++;
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

	private Double checkMinDeposit(double accountBalance ) throws MinBalanceException {
		if((double)accountBalance > this.accountType.getMinDeposit()) {
		 throw new MinBalanceException("minimum deposit amount should be "+this.accountType.getMinDeposit());
		}
		return accountBalance;
	}
	
	public double getBalance() {
		return accountBalance;
	}
	
	public void creditAmount(double amount) 
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
	

	@Override
	public String toString() {
		return "BankAccount [accountBalance=" + accountBalance + ", accountNumber=" + accountNumber + ", customerName="
				+ customerName + ", accountType=" + accountType+" Opening Date= "+ this.accountOpeningDate+"]";
	}
	
	
	//************************CUSTOMER KYC CLASS *******************
	
	class CustomerKYC {
		
		private Integer accNumber;
		private String firstName;
		private String lastName;
		private LocalDate dateOfBirth;

		
		public CustomerKYC(String firstName, String lastName, LocalDate dateOfBirth) {	
			super();
			this.accNumber = accountNumber;
			this.firstName = firstName;
			this.lastName = lastName;
			this.dateOfBirth=dateOfBirth;
		}


		public String getFirstName() {
			return firstName;
		}


		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}


		public String getLastName() {
			return lastName;
		}


		public void setLastName(String lastName) {
			this.lastName = lastName;
		}


		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		
		
	}
	
	
	
	
}
