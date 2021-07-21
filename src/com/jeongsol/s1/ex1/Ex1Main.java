package com.jeongsol.s1.ex1;

import com.jeongsol.s1.ex2.Member;

public class Ex1Main {

	public static void main(String[] args) {
		Member member = new Member();
		//Member member; //public Member() -> Member()인 경우
		member.id = "test";
		//member.name = ""; // 같은 패키지 내에서만 접근 가능
		//member.age = 30; // 같은 클래스 내에서만 접근 가능
	}

}
