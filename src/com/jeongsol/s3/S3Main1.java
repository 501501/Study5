package com.jeongsol.s3;

public class S3Main1 {

	public static void main(String[] args) {
		
		StaticTest.num = 2;
		System.out.println(StaticTest.num);
		
		StaticTest.staticMethod();
		
//		Test2 test2 = new Test2();
//		test2.t1();
//		test2.age = 1;
//		
//		Test2 test3 = new Test2();
//		test3.age = 3;

		// 가능은 하지만 사용 x
//		StaticTest st = new StaticTest();
//		System.out.println(st.num2);
//		System.out.println(st.num); //static 변수도 멤버 변수처럼 사용 가능
//		
//		st.num = 4000;
//		System.out.println(st.num);
//		
//		System.out.println(StaticTest.num);
	}

}
