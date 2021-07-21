package com.jeongsol.s2.ex1;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		
		// id
		member.setId("iu");
		String id = member.getId();
		
		// age 
		member.setAge(30);
		int age = member.getAge();
		
		// muge
		member.setMuge(120);
		int muge = member.getMuge();
		
		// ki
		member.setKi(150);
		int ki = member.getKi();
		
		System.out.println(id);
		System.out.println(age);
		System.out.println(muge);
		System.out.println(ki);
		//member.info();
	}
}
