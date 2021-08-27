package a9_¸Ş¼Òµå;

public class OverloadingEx {
	
	public int add(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	public int add2(String num1, int num2) {
		int result = Integer.parseInt(num1) + num2;
		return result;
	}
	
	public int add(int num1) {
		int result = num1 + num1;
		return result;
	}
	
	public int mul(int num1, int num2, int num3) {
		int result = num1 * num2 * num3;
		return result;
	}
	
	public double mul(int num1, double num2) {
		double result = num1 * num2;
		return result;
	}
	
	public double mul(int num1, int num2) {
		double result = num1 * num2;
		return result;
	}
	
	public void mainMethod() {
		int numberSum= add(20);
		double numberMul= mul(2, 10.5);
		System.out.println("µÎ ¼öÀÇ ÇÕÀº? " + numberSum);
	    System.out.println("°ö¼Á: " + numberMul);
	}

	
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		OverloadingEx main = new OverloadingEx();
		main.mainMethod();
	}

}
