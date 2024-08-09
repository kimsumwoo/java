package com.mycompany.ch07.thrid;

public class Studenttr extends Peopletr{
	public int number;
	
	public Studenttr(String name, String ssn, int number) {
		super(name , ssn);
		this.number =number;
	}

	@Override
	void peoplename() {
		if (number>=22) {
			super.peoplename();
		}else {
			System.out.println("Studenttr : " + name);
		}
	}
	
	

}
