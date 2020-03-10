package com.capgemini.quiz.day4;

public class QuizSeven {
 int a;
 int b;
 void math(int i,int j) {
	 i*=2;
	 j/=2;
 }
 public static void main(String[] args) {
	QuizSeven qs=new QuizSeven();
	int a=10;
	int b=20;
	qs.math(a, b);
	System.out.println(a+" "+b);
}
}
//a.10 20
//b.20 10
//c.20 40
//d.40 20
//Answera.10 20