package com.tka.dec11;

public class TestNumbersInfo {
public static void main(String[] args) {
	NumbersInfo n1 = new NumbersInfo();
	int res =n1.addTwo(5, 6);
	System.out.println("Addition is "+res);
	int res1 = n1.multiTwo(5, 6);
	System.out.println("Multiplication is "+res1);
}
}
