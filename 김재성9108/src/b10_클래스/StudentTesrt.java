package b10_Ŭ����;

public class StudentTesrt {

	public static void main(String[] args) {
		Student kim = new Student(); //������ -> Ŭ������� ����.
		
		kim.name = "���缺";
		
		kim.showInfo();
		
		Student lee = new Student(); 
		
		lee.name = "��ȿ��";
		
		kim.showInfo();
		
		System.out.println(kim);
		System.out.println(lee);
     }

}
