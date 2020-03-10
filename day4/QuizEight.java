package com.capgemini.quiz.day4;

public class QuizEight {
int a;
int b;
   QuizEight(int i, int j){
	a=i;
	b=j;
}
   void meth(QuizEight o) {
	   o.a*=2;
	   o.b /=2;
   }
public static void main(String[] args) {
	QuizEight qe=new QuizEight( 10,20);
	qe.meth(qe);
	System.out.println(qe.a+" "+qe.b);
}
}
//a.10 20
//b.20 10
//c.20 40
//d.40 20
//Answer:b.20 10