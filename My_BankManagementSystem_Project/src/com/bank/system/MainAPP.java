package com.bank.system;

import static com.utility.AccountValidation.*;

import java.util.ArrayList;
import java.util.Scanner;

import com.bank.entity.AccountType;
import com.bank.entity.BankAccount;
import com.utility.DemoBankData;

public class MainAPP {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in))
		{				
			ArrayList<BankAccount> bankAccounts=DemoBankData.getDemoData();
			while(true) {
				System.out.println("CHOOSE FOLLOWIG OPTION\n"
						+ "1. Create Account\n"
						+ "2. Debit Amount\n"
						+ "3. Credit Amount\n"
						+ "4. Account Summary\n"
						+ "5. Funds Transfer\n"
						+ "6. Exit");
				
			switch (sc.nextInt()) {
			case 1: 
				System.out.println("To create Bank account fill the following details\nDeposit\nCustomer Name\nAccountType\nset pin");
				BankAccount bankAcc = new BankAccount(sc.nextDouble(), sc.next(), AccountType.valueOf(sc.next().toUpperCase()),sc.nextInt());
				bankAccounts.add(bankAcc);
				System.err.println(bankAcc);
				System.out.println("Account created");
				break;

			case 2:
				try {
				System.out.println("Enter the Account number and pin: ");
				int accNumber=sc.nextInt();
				int pin=sc.nextInt();
				if(isAccountNumberAndPinMatched(bankAccounts, accNumber, pin)) {
					System.out.println("Enter amount to withdraw: ");
					getBankAccount(bankAccounts, accNumber).debitAmount(sc.nextInt());
				}				
				}catch(Exception e){
					System.out.println(e);
				}
				break;
			case 3 : 
				try {
				System.out.println("Enter the Account number and Amount: ");
				int accNumber=sc.nextInt();
				getBankAccount(bankAccounts, accNumber).creditAmount(sc.nextInt());
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 4:
				try {
				System.out.println("Enter the Account number: ");
				System.out.println(getBankAccount(bankAccounts, sc.nextInt()));
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 5:
				try {	
				System.out.println("Enter your Account number and pin: ");
				int accNumber1=sc.nextInt();
				int pin=sc.nextInt();
				System.out.println("Enter account number of other person: ");
				int accNumber2=sc.nextInt();
				if(isAccountNumberAndPinMatched(bankAccounts, accNumber1, pin) && isBankAccountExists(bankAccounts, accNumber2)) {
					System.out.println("Enter amount to transfer: ");
					getBankAccount(bankAccounts, accNumber1).fundsTransfer(getBankAccount(bankAccounts, accNumber2), sc.nextInt());
				}
				}catch(Exception e) {
					System.out.println(e);
				}
				break;
			case 6:	
				System.out.println("Thank You!");
				System.exit(0);;
				break;
			}
			}
		}catch(Exception e){
			System.out.println(e);
		
		}
		}


}
