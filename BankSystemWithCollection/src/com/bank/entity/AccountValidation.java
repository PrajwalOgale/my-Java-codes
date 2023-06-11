package com.bank.entity;

import java.util.List;

public class AccountValidation {
	
	
	
	public static boolean validateDuplicates(List<BankAccount> accounts,int accNumber) throws ValidateAccountsException{
		BankAccount ba=new BankAccount(accNumber);
		if(accounts.contains(ba)) {
			throw new ValidateAccountsException("NO duplicates allowed.");
		}
		return false;
	}
	
	public static boolean isAccountNumberAndPinMatched(List<BankAccount> accounts, int accNum, int pin) throws ValidateAccountsException {
//		BankAccount ba=new BankAccount(accNum, pin);
		for(BankAccount ba:accounts) {
			if((ba.getAccountNumber()==accNum )){
				if(ba.getPin()==pin){
					return true;
				}else {
					throw new ValidateAccountsException("Incorrect Pin.");								
				}
			}
		}
		throw new ValidateAccountsException("Invalid Account Number.");
		
	}
	
	public static BankAccount getBankAccount(List<BankAccount> accounts,int accNumber)throws ValidateAccountsException {
		BankAccount ba=new BankAccount(accNumber);
		if(accounts.indexOf(ba)==-1) {
			 throw new ValidateAccountsException("Account not found.");
		}
		return accounts.get(accounts.indexOf(ba));
	}
	
	public static boolean isBankAccountExists(List<BankAccount> accounts,int accNumber)throws ValidateAccountsException {
		BankAccount ba=new BankAccount(accNumber);
		if(accounts.indexOf(ba)==-1) {
			 throw new ValidateAccountsException("Account not found.");
		}
		return true;
	}
}
