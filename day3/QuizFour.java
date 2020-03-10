package com.capgemini.quiz.day3;

public class QuizFour {
public static void main(String[] args) {
	int a=1;
	int b=2;
	int c;
	int d;
	c=++b;
	d=a++;
	c++;
	b++;
	++a;
	System.out.println(a+" "+b+" "+c);
	/*
	 *
	 *a.3 2 4
	 *b.3 2 3
	 *c.2 3 4
	 *d.3 4 4
	 *
	 *D.3 4 4
	 */
}
}
