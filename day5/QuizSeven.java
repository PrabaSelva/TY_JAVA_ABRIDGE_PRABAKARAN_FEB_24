package com.capgemini.quiz.day5;

public class QuizSeven {
public static void main(String[] args) {
	int x=20;
	String s=(x<15)?"small":(x<22)?"tiny":"huge";
	System.out.println(s);
	/*
	 * a.small
	 * b.tiny
	 * c.huge
	 * d.compilation fails
	 * 
	 * answer.b.tiny
	 */
}
}
