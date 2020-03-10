package com.capgemini.quiz.day6;

public class QuizFive {
	public static void main(String args[]) 
    {        
         byte x = 64;
         int i;
         byte y; 
         i = x << 2;
         y = (byte) (x << 2);
         System.out.print(i + " " + y);
    } 

/*a) 0 64
*b) 64 0
*c) 0 256
*d) 256 0
*anwer:d.256 0
**/
}
