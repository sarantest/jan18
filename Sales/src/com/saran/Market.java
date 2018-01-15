package com.saran;

public class Market {
	
	public static void main(String[] args) {
		SalesData s1=new SalesData();
		marketWelcome();
		s1.call();
	}
	
	private static void marketWelcome(){
		System.out.println("Welcome");
	}

}
