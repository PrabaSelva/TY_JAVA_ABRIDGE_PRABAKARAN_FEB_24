package com.capgemini.quiz.day4;

public class QuizTwo {
	int width;
	int height;
	int length;
	
public static void main(String[] args) {
	QuizTwo qt=new QuizTwo();
	QuizTwo q1t=new QuizTwo();
	qt.height=1;
	qt.length=2;
	qt.width=1;
	
    q1t=qt;
    System.out.println(q1t.height);
    
    /*
     * a.1
     * b.2
     * c.runtime error
     * d.Garbage value
     * 
     * answer.A.1
     */
}
}
