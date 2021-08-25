package a8_반복;

public class ContinueEx {

	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			if(i % 2 == 0) {
				System.out.println(i + "은(는) 짝수입니다.");
				//continue;
				break;
			}
			System.out.println(i + "은(는) 홀수입니다.");
		}

	}

}
