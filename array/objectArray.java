package com.capgemini.array;

public class objectArray {
public static void main(String[] args) {
	Account obj[]=new Account[2];
	obj[0]=new Account();
	obj[1]=new Account();
	obj[0].setData(1,2);
	obj[1].setData(3,4);
	System.out.println("for array elements 0");
	obj[0].showData();
	System.out.println("for array elements 1");
	obj[1].showData();
}
}
