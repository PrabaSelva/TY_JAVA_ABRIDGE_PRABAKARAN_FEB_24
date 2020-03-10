package com.capgemini.quiz.day5;

public class QuizSix {
public static void main(String[] args) {
	int count=1;
	while(count<=15) {
		System.out.println(count % 2==1?"*****":"++++++++");
		++count;
	}
	/*a.15 times *****
	 * b.15 times +++++++++
	 * c.8 times *** and 7 times +++++++++
	 * d.it print only once
	 * 
	 * Ans.C.
	 */
	
}
}
