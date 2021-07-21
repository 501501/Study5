package com.jeongsol.s1.ex2;

public class Member {
	
	public String id;
	
	int age; //default
	
	private String name;
	
	//Member() { //같은 패키지 내에서만 사용 가능
	
	// 객체를 만드려면 생성자를 호출해야 함
	// private Member() { // 같은 클래스 내에서만 사용이 가능하므로 객체를 생성할 수 없음
	public Member() {
		this.id = "iu";
		this.age = 29;
		this.name = "choa";
	}
	
	public Member test() { //private Member()인 경우에도 생성자 호출이 불가능해 객체를 생성할 수 없음
		return new Member(); //singleton 디자인 패턴 생성 시 사용하는 경우가 있음 객체가 단 하나만 생성되어야하는 경우
	}
}
