package com.mycompany.ch07first;

public class MobilePhoneEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cellphone cellphone = new Cellphone();
		
		cellphone.poweron();
		
		DmbCellPhone dmbCellPhone = new DmbCellPhone();
		
		dmbCellPhone.turnOnDmb();
		
		dmbCellPhone.poweron();
		
		Mobile mobile = new Mobile();
		
		mobile.poweroff();
		mobile.changeChannelDmb(1);
		mobile.aaa();

	}

}
