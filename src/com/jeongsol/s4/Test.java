package com.jeongsol.s4;

public class Test {
	int num = 10;
	final int num2;
	//final int num2 = 10; //경우에는 에러
	
//	{
//		num2 = 10;
//	}
	
	public Test() {
		num2 = 10;
	}
	
	public Test(int num2) {
		this.num2 = num2;
	}
}
