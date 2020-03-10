package com.capgemini.assesment;

public class Varargs {
	static void fun(int...a) {
		System.out.println("Number of arguments"+a.length);
		
		for(int i:a)
			System.out.println(i+" ");
		    System.out.println();
	}
public static void main(String[] args) {
	fun(100);
	fun(1,2,3,4);
	fun();
}
}
