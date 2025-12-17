package com.overload;
//Q.11
public class Number {
	int max(int y , int z) {
		if(y>z)
			return y;
		else return z;
		
		}
		
		int max(int a, int b, int c) {
			if(a>b && a>c)
				return a;
			else if(b<c)
				return b;
			else 
				return c;
			
		}
		public static void main(String[] args) {
			Number num=new Number();
			System.out.println("Maximun of two number is:"+num.max(90, 95));
			System.out.println("Maximum of three number is:"+num.max(55, 65, 85));
			
		}
	}


