package b19_����ƽ;

public class StaticTest {

	public static void main(String[] args) {
		Connector.connect();
		Integer.parseInt(null);
		
		Student s1 = new Student("������");
		Student s2 = new Student("���缺");
		Student s3 = new Student("��");
		Student s4 = new Student("������");
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
	}

}
