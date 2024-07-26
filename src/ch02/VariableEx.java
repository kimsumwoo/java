package ch02;

public class VariableEx {

	
//		상수 표기법
		static final int SOCIAL_SECURITY_NUMBER = 11111111;
		
//		스네이크 표기법
		int social_security_number;
		
//		파스칼 표기법 : 클래스
		int SocialSecurityNumber;
		
//		카멜 표기법 : 변수,함수
		int socialSecurityNumber;

	
public static void main(String[] args) {
	// TODO Auto-generated method stub
		int number = 1;
		int Number = 2;
		System.out.println(number + ":" + Number);
//		
		int a;
		//a에 할당값을 안줘서 오류가뜸
		int b = 1;
		int c = 0;
		
//		c = a + b;
		
		
//		-----------------
		
//		변수의 범위
//		변수는 선언된 블럭 내에서만 사용 가능하다.
		
		int d = 1;
		
		if(d == 1) {
			int aaa = 10;
			int bbb = aaa + d;
			System.out.println("bbb:" + bbb);
		} else {
			
		}
	
//		System.out.println("aaa :" + aaa);
//		System.out.println("bbb :" + bbb);
		System.out.println("d: " + d);
		
			
			
			
			
			
			
			
			
		}

	}


	