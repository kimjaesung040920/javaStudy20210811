package b19_����ƽ;

public class Car {
	private int serialNum;
	private String model;
	
	public Car(int serialNum, String model) {
		this.serialNum = serialNum;
		this.model = model;
	}
	
	public void carInfo() {
		System.out.println("���� �ø��� ��ȣ: " + serialNum);
		System.out.println("���� ��: " + model);
	}
}
