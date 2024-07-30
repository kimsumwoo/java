package com.mycompany.ch04;

public class If5_tr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 1;
		int b = 3;
		int c = 3;
		
		if(a!=b && b!=c && a!=c) {
			if(a>b && a>c) {
				System.out.println("최대값은" + a);
			}else if(b>a && b>c) {
				System.out.println("최대값은" + b);
			}else {
				System.out.println("최대값은" + c);
			}
		if(a<b && a<c) {
				System.out.println("최소값은 " + a);	
			}else if(b<a && b<c) {
				System.out.println("최소값은 " + b );
			}else {
				System.out.println("최소값은" + c);
			}
		
			} else {
				System.out.println("중복값이 있습니다.");
			}
			

	}

}
