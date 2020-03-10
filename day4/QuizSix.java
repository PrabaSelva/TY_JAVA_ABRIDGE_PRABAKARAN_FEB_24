package com.capgemini.quiz.day4;

public class QuizSix {
int x;
double y;
void add(int a,int b) {
	x=a+b;
}
void add(double c ,double d) {
	y=c+d;
}
void overload(){
	this.x=0;
	this.y=0;
}
public static void main(String[] args) {
	QuizSix qs=new QuizSix();
	int a=2;
	double b=3.2;
	qs.add(a, a);
	qs.add(b, b);
	System.out.println(qs.x+" "+qs.y);
}
}
// a.6 6
//b.6.4 6.4
//6.4 6
//4 6.4

//answer:d.4 6.4
