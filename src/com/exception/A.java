package com.exception;
//Throw
public class A {
	public void m1() {
		int a=10;
		int b=0;
		
		if(b==0) {
			throw new PranaliException("this is my own Exception:Sorry thid is not Allowed..!");
		}
		int result=a/b;
		System.out.println(result);
	}

}
