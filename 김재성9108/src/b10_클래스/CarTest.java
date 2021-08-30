package b10_클래스;

public class CarTest {

	public static void main(String[] args) {
	Car sonata = new Car();	
	Car k7 = new Car();
	Car tesla_model3 = new Car();
	
     	sonata.setCompany("현대자동차");
		k7.setCompany("KIA자동차");
		tesla_model3.setModel("tesla");
		
		sonata.setModel("소나타");
	    k7.setModel("k7");
		tesla_model3.setModel("model3");
		
		sonata.carInfo();
		k7.carInfo();
		tesla_model3.carInfo();
		
		
		
	    // sonata 변수명
		//제조사: 현대자동차
		//모델: 소나타
		//색상: 블랙
		//연식: 2019
		
		// k7
		// 제조사: KIA자동차
		// 모델: k7
		// 색상: 화이트
		// 연식: 2020
		
		// tesla_model3
		// 제조사: tesla
		// 모델: model3
		// 색상: 화이트
		// 연식: 2021
		
		
		
		
		
		
		
		
		}

}
