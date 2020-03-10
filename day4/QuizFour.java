package com.capgemini.quiz.day4;

public class QuizFour {
   int x;
   int y;
   void add(int a) {
	   x=a+1;
   }
   void add(int a,int b) {
	   x=a+2;
   }
   public static void main(String[] args) {
	QuizFour qf=new QuizFour();
	int a=0;
	qf.add(6);
	System.out.println(qf.x);
	//a.5
//b.5
//c.7
//d.8
//answer::c.7
}
}
