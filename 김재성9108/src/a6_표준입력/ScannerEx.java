package a6_ǥ���Է�;

import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		// String �⺻���� Ŭ����
		// Scanner �ܺ� Ŭ����
		
		// �ڵ� import
		// Ctrl + �����̽��� -> �ϳ��� Ŭ���� import
		// Ctrl + Shift + o -> ��� Ŭ���� import
        Scanner input = new Scanner(System.in);
        
        System.out.println("���� 2���� �Է��� �ּ���: ");
        
        System.out.print("ù��° ��: ");
        
        String str = input.nextLine();
       
        System.out.print("�ι�° ��: ");
        String str2 = input.nextLine();
        
        int i = Integer.parseInt(str);
        int i2 = Integer.parseInt(str2);
        
        System.out.print("���: ");
        System.out.println(i + i2);
        
        
        

	}

}
