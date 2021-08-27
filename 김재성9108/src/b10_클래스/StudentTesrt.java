package b10_클래스;

public class StudentTesrt {

	public static void main(String[] args) {
		Student kim = new Student(); //생성자 -> 클래스명과 같다.
		
		kim.name = "김재성";
		
		kim.showInfo();
		
		Student lee = new Student(); 
		
		lee.name = "이효원";
		
		kim.showInfo();
		
		System.out.println(kim);
		System.out.println(lee);
     }

}
