package com.mycompany.ch03;

public class LogicalOperator5_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 70;
		if(a<75 && a>60) {
			System.out.println("&& : true");
		}
		if(a<75 & a>60) {
			System.out.println("& : true");
		}
		if(a<75 || a>60) {
			System.out.println("|| : true");
		}
		if(a<75 | a>60) {
			System.out.println("| : true");
		}
		if(a<70 ^ a>60) {
			System.out.println("^1 : true");
		}
		
		

	}

}
