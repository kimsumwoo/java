package com.mycompany.ch07first;

public class MobilePhonetrEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CellPhonetr cellPhonetr = new CellPhonetr();
		
		cellPhonetr.powerOn();

		DmbCellPhonetr dmbCellPhonetr = new DmbCellPhonetr();
		
		dmbCellPhonetr.change(1);
		
		Mobiletr mobiletr = new Mobiletr();
		
		mobiletr.aaa();
		mobiletr.powerOn();

	}

}
