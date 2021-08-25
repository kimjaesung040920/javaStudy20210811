package a8_반복;

import java.util.Scanner;

public class Gugudan {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    
        System.out.print("단수를 입력해 주세요:");
		int gugudan = in.nextInt();
		
		System.out.println(gugudan + "단");
        for (int i = 0; i < 9; i++) {
			 int i2 = i + 1;
         
			 System.out.println(gugudan + " X " + i2 + " = " + 3*i2);
		}
		System.out.println();
		
		
	    
        }
}    


