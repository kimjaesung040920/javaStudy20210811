package a8_นÝบน;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
   /*	int star = in.nextInt();
	*	
	*	 for(int i = 0; i < star; i++) {
	*		 for(int j = 0; j < i + 1; j++) {
	*			 System.out.println("*");
	*		 }System.out.println();
	*/
        for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 1 + i; j++) {
        		System.out.print("*");
        	}
            System.out.println();
        }
        System.out.println();
        
        for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 5 - i; j++) {
        		System.out.print("*");
        	}
           System.out.println();
        }
        System.out.println();
        
        for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 5 -i + 1; j++) {
        		System.out.print(" ");
        	}
        for(int j = 0; j < (i*2)+1; j++) {
        	System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
		} 
	}

