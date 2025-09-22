package com.codegnan.OOPexamples;

public class BankAccount {
	
	    double balance;

	    // Constructor to initialize the balance
	    public BankAccount(double balance) {
	        this.balance = balance;
	    }

	    // Overloaded Deposit method 1: takes only the amount
	    public void Deposit(double amount) {
	        balance += amount;
	            System.out.println("Deposited by cash : " + amount);
	        }

	    // Overloaded Deposit method 2: takes amount and cheque number
	    public void Deposit(double amount, String chequeNumber) {
	       balance += amount;
	            System.out.println("Deposited : " + amount + " with cheque number " + chequeNumber);
	        }

	    // Overloaded Deposit method 3: takes amount, transaction ID, and bank name
	    public void Deposit(double amount, String transactionId, String bankName) {
	        balance += amount;
	            System.out.println("Deposited : " + amount + " from transaction ID " + transactionId + " at " + bankName);
	        } 

	    // Method to display the current balance
	    public void showBalance() {
	        System.out.println("Current balance is : " +balance);
	    }
	}


