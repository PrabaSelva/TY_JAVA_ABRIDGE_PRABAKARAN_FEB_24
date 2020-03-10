package com.capgemini.multidimensionalarray;

public class A {

	public static void main(String[] args) {
		int[] [] a= {{ 1,2},{3,4}};
		System.out.println("no of rows"+a.length);
       for(int i=0;i<2;i++) {
    	   for(int j=0;j<2;j++) {
    		   System.out.println("arr["+i+"]["+j+"]="+a[i][j]);
    	   }
       }
	}

}
