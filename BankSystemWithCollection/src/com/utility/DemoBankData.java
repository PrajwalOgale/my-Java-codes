package com.utility;

import java.util.ArrayList;

import com.bank.entity.AccountType;
import com.bank.entity.BankAccount;

public class DemoBankData {
	
	public static ArrayList<BankAccount> getDemoData(){
		
	
	ArrayList<BankAccount> bankAcc=new ArrayList<>();
	
	bankAcc.add(new BankAccount(10001,5000, "Prajwal Ogale", AccountType.valueOf("saving".toUpperCase()),1234));
	bankAcc.add(new BankAccount(10004,100, "Chris Hemsworth", AccountType.valueOf("salary".toUpperCase()),5252));
	bankAcc.add(new BankAccount(10003,1000, "Tom Cruise", AccountType.valueOf("current".toUpperCase()),4321));
	bankAcc.add(new BankAccount(10002,500, "John Cena", AccountType.valueOf("saving".toUpperCase()),1245));
	bankAcc.add(new BankAccount(10006,4000, "Christian Bale", AccountType.valueOf("salary".toUpperCase()),4565));
	bankAcc.add(new BankAccount(10005,200, "Chris Evans", AccountType.valueOf("current".toUpperCase()),5252));
	
	return bankAcc;
	}
	
}
