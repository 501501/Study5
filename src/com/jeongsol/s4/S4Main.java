package com.jeongsol.s4;

public class S4Main {

	public static void main(String[] args) {
		Test t = new Test();
		
		t.num = 200;
		//t.num2 = 900; final은 값 변경 불가능
		
		System.out.println(t.num);
		System.out.println(t.num2);
	}

}
