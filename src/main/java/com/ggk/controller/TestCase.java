package com.ggk.controller;

public class TestCase {
	
	public static void main(String[] args) {
		C c1=new C();
		c1.doYoYo();
		c1.doYoManStuff();
		
		I i1=(I)c1;
		B b1=(B)i1;
		b1.doSomething();
	}
	
}

