package b11_�迭;

/**
 * 
 * Array(�迭)
 * ���� �ڷ��������� ����.
 * index(�ε���)
 * index������ ��ȣ =[] ���ȣ
 *
 */

public class ArrayEx1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		int num4 = 40;
		int num5 = 50;
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5);
		
		// �迭 ���� �� ��� ���
		// 1.
		int[] num = new int[100];
		
		for(int i = 0; i < 100; i++) {
			num[i] = i*10;
		}
		for(int i = 0; i < 100; i++) {
			System.out.println(num[i]);
		}
	    
		// 2.
            int[] arr_i = new int[] {10, 20, 30, 40, 50};
		    
            int[] arr_i2 = {10, 20, 30, 40, 50};
            
		
		for(int i =0; i < 5; i++) {
			System.out.println(num[i]);
		}
		
	}
}
