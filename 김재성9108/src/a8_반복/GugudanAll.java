package a8_�ݺ�;

import java.util.Scanner;

public class GugudanAll {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("���� �ܼ�: ");
		int gugudanStart = in.nextInt();
		System.out.println("������ �ܼ�: ");
		int gugudanEnd = in.nextInt();
		
		for(int i = gugudanStart; i < gugudanEnd+1; i++) {
			
			System.out.println(i + "��");
	        for(int j = 0; j < 9; j++) {
	    	    int j2 = j +1;
	    	
	    	System.out.println(i + " X " + j2 + " = " + i*j2);
	      }	
	      System.out.println();   	
		}
	    	
	}	     
}	  
        
	


