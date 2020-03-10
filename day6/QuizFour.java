package com.capgemini.quiz.day6;

public class QuizFour {
	public static void main(String args[]) 
    {    
         int a = 1;
         int b = 2;
         int c = 3;
         a |= 4;
         b >>= 1;
         c <<= 1;
         a ^= c;
         System.out.println(a + " " + b + " " + c);
     /*    a) 3 1 6
      *   b) 2 2 3
      *   c) 2 3 4
      *   d) 3 3 6
      *   */
         //answera. 3 1 6
    } 
}
