package com.mycompany.ch04;

public class For1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=2; i<=9; i++) {
			for(int j=1; j<=9; j++) {
					System.out.println(i + "*" + j + "=" + i*j );
//				if(j==9) {
//					System.out.println("-----------------");
//				} else if(i==9 && j==9){
//					System.out.println("    s sss      ");
//				} else {
//				
//				}
			}
			if(i !=9) {
				System.out.println("------------");
			} else {
//				by pass
			}
				
		}

	}

}
