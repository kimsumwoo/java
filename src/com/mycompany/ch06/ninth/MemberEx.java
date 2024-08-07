package com.mycompany.ch06.ninth;

public class MemberEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Member member = new Member();
		
//		member.name = "Tony"
		
		member.setName("Tony");
		
//		member.age = 27;
		member.setAge(27);
		
//		System.out.println("member.name: " + member.name);
		System.out.println("member.name:" + member.getName());
		System.out.println("member.age: " + member.getAge());
		
	}

}
