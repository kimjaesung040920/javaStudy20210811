package a4_형변환;

public class ConversionString {

	public static void main(String[] args) {
		// 문자열(String)의 형변환
		int num = 10;
		int num2 = 10;
		String sNum = "10";
		
		System.out.println(num + num2 + sNum);
		System.out.println(sNum + (num + num2));
		
		// 문자열 -> 다른 자료형(boolean, int, double)
		// int(정수): Integer.parseInt(문자열);
		int i = Integer.parseInt("10.1");
		int d = (int)Double.parseDouble("10.1");
		boolean b = Boolean.parseBoolean("true");
		
		// 다른 자료형 -> 문자열
		// int(정수): integer.toString(정수);
		Integer.toString(10);
		Double.toString(10.2);
		Boolean.toString(false);


	}

}
