package com.capgemini.assesment;

import java.util.Scanner;

public class Switch {
	public static void main(String[] args) {
		
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Press the number");
	int a=sc.nextInt();
	do {
	switch(a){
	case 1:
		   System.out.println("enter ur name");
		   String name=sc.next();
		   System.out.println(name);
	       break;
	case 2:System.out.println("enter age");
	       int age=sc.nextInt();
	       System.out.println(age);
	       break;
	case 3:
		   System.out.println("enter the place");
		   String place=sc.next();
		   System.out.println(place);
	       break;
	case 4:
		   System.out.println("enter the address");
		   String address=sc.next();
		   System.out.println(address);
	       break;
	default:
		   System.out.println("invalid");
	       break;
	}
	}while(true);
	
	}
}
