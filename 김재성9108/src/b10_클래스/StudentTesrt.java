package b10_클래스;

public class StudentTesrt {

	public static void main(String[] args) {
        Student kim = new Student("김준일", 4);
        Student lee = new Student("이지원", 2);
        Student park = new Student("박호훈","코리아아이티", 3);
        
        //kim.name = "김준일"; //   .은 해당 메모리 주소값을 참조한다라고 한다.
     
        kim.showInfo();
        
        Integer i = new Integer(100);
        
        System.out.println(kim.hashCode());
        System.out.println(i.hashCode());
        
        kim.getFreebies();
        lee.getFreebies();
	}

}