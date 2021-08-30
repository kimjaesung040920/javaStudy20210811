package b10_클래스;



public class GetterAndSetter {
	
	public static void main(String[] args) {
	   Student kim = new Student();
	
	   // kim.name = "김준일";
	   // Setter()
	   
	   kim.setName("김준일");
	   kim.setSchoolName("코리아아이티아카데미");
	   kim.setYear(2);
	   
	   
	   System.out.println(kim.getName());
	}	
	
	
}
