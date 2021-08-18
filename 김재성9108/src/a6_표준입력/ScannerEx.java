package a6_표준입력;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String 기본제공 클래스
		// Scanner 외부 클래스
		
		// 자동 import
		// Ctrl + 스페이스바 -> 하나의 클래스 import
		// Ctrl + Shift + o -> 모든 클래스 import
        Scanner input = new Scanner(System.in);
        
        System.out.println("숫자 2개를 입력해 주세요: ");
        
        System.out.print("첫번째 수: ");
        
        String str = input.nextLine();
       
        System.out.print("두번째 수: ");
        String str2 = input.nextLine();
        
        int i = Integer.parseInt(str);
        int i2 = Integer.parseInt(str2);
        
        System.out.print("결과: ");
        System.out.println(i + i2);
        
        
        

	}

}
