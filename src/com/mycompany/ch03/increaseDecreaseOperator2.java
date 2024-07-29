package com.mycompany.ch03;

public class increaseDecreaseOperator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 7;
		int j = 8;
		
		i = i++;
		j = ++j;
		
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
		int k = ++i;
		int m = j++;
		
		System.out.println("k:" + k);
		System.out.println("m:" + m);
		System.out.println("i:" + i);
		System.out.println("j:" + j);
		
		--i;
		int z  = ++i + j++;
		
		System.out.println("z:" + z);
		System.out.println("i:" +i);
		System.out.println("j:" +j);
	
		
		

	}

}
