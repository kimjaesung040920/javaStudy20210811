package a4_����ȯ;

public class ConversionString {

	public static void main(String[] args) {
		// ���ڿ�(String)�� ����ȯ
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		
		System.out.println(num + num2 + sNum);
		System.out.println(sNum + (num + num2));
		
		// ���ڿ� -> �ٸ� �ڷ���(boolean, int, double)
		// int(����): Integer.parseInt(���ڿ�);
		int i = Integer.parseInt("10.1");
		int d = (int)Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
		// �ٸ� �ڷ��� -> ���ڿ�
		// int(����): integer.toString(����);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);


	}

}
