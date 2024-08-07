package com.mycompany.ch07first;

public class DmbCellPhonetr extends CellPhonetr {
	
	int chanel;
	
	public void dmbOn() {System.out.println("dmb전원을 킵니다");}
	
	public void change(int chanel) {
		this.chanel = chanel;
		System.out.println(chanel + "번으로 바꿉니다");
	}
	
	public void dmbOff() {System.out.println("dmb전원을 끕니다.");}

}
