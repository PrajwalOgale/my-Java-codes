package com.utility;

import java.util.ArrayList;

import com.bank.entity.BankAccount;

public class AccountValidation {
	
	public static boolean isAccountNumberAndPinMatched(ArrayList<BankAccount> accounts, int accNum, int pin) throws ValidateAccountsException {
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
	
	public static BankAccount getBankAccount(ArrayList<BankAccount> accounts,int accNumber)throws ValidateAccountsException {
		BankAccount ba=new BankAccount(accNumber);
		if(accounts.indexOf(ba)==-1) {
			 throw new ValidateAccountsException("Account not found.");
		}
		return accounts.get(accounts.indexOf(ba));
	}
	
	public static boolean isBankAccountExists(ArrayList<BankAccount> accounts,int accNumber)throws ValidateAccountsException {
		BankAccount ba=new BankAccount(accNumber);
		if(accounts.indexOf(ba)==-1) {
			 throw new ValidateAccountsException("Account not found.");
		}
		return true;
	}
}
