package com.capgemini.quiz.day3;

public class QuizSeven {
public static void main(String[] args) {
	int x = 2;
	int y=0;
	for( ;y<10;++y) {
		if(y%x==0)
	continue;
		else if(y==8)
			break;
		else
			System.out.print(y+" ");
	}
}
}
/*
 *  a.1 3 5 7
 *  b.2 4 6 8
 *  c.1 3 5 7 9
 *  d.1 2 3 4 5 6 7 8 9
 *  Answer:c.1 3 5 7 9
 */
