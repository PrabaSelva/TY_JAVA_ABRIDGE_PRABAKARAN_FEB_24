package com.capgemini.quiz.day1;

public class QuizSeven {
public static void main(String[] args) {
	double[]a= {5,5.4,5,11,12,8,56.9,2.5};
	double result;
	result=0;
	for(int i=0;i<=6;++i) {
		result=result+a[i];
	}
	System.out.println((result/6));
	//Answer:17.2166666625
}
}
