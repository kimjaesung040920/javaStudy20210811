package a8_반복;

import java.util.Scanner;

public class StarEx1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("별의 개수: ");
		int star = in.nextInt();
		
		 for(int i = 0; i < star; i++) {
			 for(int j = 0; j < i + 1; j++) {
				 System.out.println("*");
			 }
			System.out.println();
		}
	}

}
