package com.capgemini.quiz.day3;

public class QuizFive{
public static void main(String[] args) {
	int a,b,c,d;
	a=b=c=d=20;
	a+=b-=c*=d/=20;
	System.out.println(a+" "+b+" "+c+" "+d);
}
/*
 * a.compile time error
 * b.runtime error
 * c.a=20 b=0 c=20 d=1;
 * d.none of the mentioned
 * 
 * Answer:c.a=20,b=0;c=20;d=1
 */
}
