package a8_�ݺ�;

import java.util.Scanner;

public class Gugudan {

public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    
        System.out.print("�ܼ��� �Է��� �ּ���:");
		int gugudan = in.nextInt();
		
		System.out.println(gugudan + "��");
        for (int i = 0; i < 9; i++) {
			 int i2 = i + 1;
         
			 System.out.println(gugudan + " X " + i2 + " = " + 3*i2);
		}
		System.out.println();
		
		
	    
        }
}    


