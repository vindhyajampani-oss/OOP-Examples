package com.codegnan.OOPexamples;

public class MainBankAccount {

	
	    public static void main(String[] args) {
	        // Create a BankAccount object with an initial balance of 5000.0
	        BankAccount myAccount = new BankAccount(5000.0);
	           myAccount.Deposit(10000);
	           myAccount.Deposit(2000, "CHQ79834");
	           myAccount.Deposit(2000, "T-123456789","HDFC BANK" );
	           myAccount.showBalance();
	    }
	}