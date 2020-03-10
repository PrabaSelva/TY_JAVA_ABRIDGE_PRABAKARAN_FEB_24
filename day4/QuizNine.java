package com.capgemini.quiz.day4;

public class QuizNine {
int func(int n) {
	int result;
	result =func(n-1);
	return result;
}
public static void main(String[] args) {
	QuizNine qn=new QuizNine();
	System.out.println(qn.func(12));
}
}
//a.0
//b.1
//c.compilation error
//d.runtime error
//ans:d.runtime error