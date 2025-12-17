package com.bank.files;

public class BankFiles {
public static void main(String[] args) {
	com.bank.savings.Account a1= new com.bank.savings.Account();
	com.bank.current.Account a2= new com.bank.current.Account();
	String res1 = a1.accountType1("Savings");
    String res2= a2.accountType2("Current");
    System.out.println("Account 1 is "+res1);
    System.out.println("Account 2 is "+res2);
}
}
