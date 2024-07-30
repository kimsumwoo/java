package com.mycompany.ch04;

public class If4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x =0;
		int y =0;
		
		if(x>0&y>0){
			System.out.println("x양수 y양수이므로 1사분면");
		} else if(x<0 & y>0){
			System.out.println("x음수 y양수이므로 2사분면");
		} else if(x<0 & y<0){
			System.out.println("x음수 y음수이므로 3사분면");
		} else if(x>0 & y<0){
			System.out.println("x양수 y음수이므로 4사분면");
		} else{
			System.out.println("모르겠음");
		}
		
//		int a = -2;
//		int b = 0;
//		
//		if(a>0 && b>0) {
//			System.out.println("(a,b)는 1사분면에 위치합니다");
//		} else if(a<0 && b>0) {
//			System.out.println("(a,b)는 2사분면에 위치합니다");
//		} else if(a<0 && b<0) {
//			System.out.println("(a,b)는 3사분면에 위치합니다");
//		} else if(a>0 && b<0) {
//			System.out.println("(a,b)는 4사분면에 위치합니다");
//		} else if(a==0 && b!= 0) {
//			System.out.println("(a,b)는 x축 위에 있습니다");
//		} else if(a!=0 && b== 0) {
//			System.out.println("(a,b)는 y축 위에 있습니다");
//		} else {
//			// a==0 & b==0
//			System.out.println("(a,b)는 원점입니다.");
//		}
//			
			
		
		

	}

}
