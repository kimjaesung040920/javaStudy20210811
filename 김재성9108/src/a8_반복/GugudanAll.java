package a8_반복;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("시작 단수: ");
		int gugudanStart = in.nextInt();
		System.out.println("마지막 단수: ");
		int gugudanEnd = in.nextInt();
		
		for(int i = gugudanStart; i < gugudanEnd+1; i++) {
			
			System.out.println(i + "단");
	        for(int j = 0; j < 9; j++) {
	    	    int j2 = j +1;
	    	
	    	System.out.println(i + " X " + j2 + " = " + i*j2);
	      }	
	      System.out.println();   	
		}
	    	
	}	     
}	  
        
	


