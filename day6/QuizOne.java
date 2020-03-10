package com.capgemini.quiz.day6;

public class QuizOne {
	
        int x;
        int y;
        boolean isequal()
        {
            return(x == y);  
        } 
      
    
        public static void main(String args[]) 
        {
           QuizOne obj = new QuizOne();
            obj.x = 5;
            obj.y = 5;
            System.out.println(obj.isequal());
        } 
       /* a) false
       * b) true
       * c) 0
       * d) 1
       * */
        //Ans.b.true
}
