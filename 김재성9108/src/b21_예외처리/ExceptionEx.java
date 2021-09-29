package b21_����ó��;

import java.time.DateTimeException;

/**
 * 
 * Exception(����)
 * 1. ����(�ҽ��ڵ�) ����
 * 2. ������ ����
 * 3. ����
 * 4. catch�� exception�� ��Ƽ� �����ټ�����
 * 
 * 	throws(ȣ���� ��ġ�� ���� �̷��)
 */

public class ExceptionEx {
	public static void arrTest() throws ArrayIndexOutOfBoundsException{
		int[]arr = new int[5];
		
		for(int i = 0; i <= 5; i++) {
			arr[i] = i;
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		try {
			ExceptionEx.arrTest();
		} catch (DateTimeException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (SecurityException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� ũ�⸦ �ʰ��Ͽ� �����Ͽ����ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("���α׷� ����. ");

	}

}
