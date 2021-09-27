package b19_½ºÅÂÆ½;

public class Car {
	private int serialNum;
	private String model;
	
	public Car(int serialNum, String model) {
		this.serialNum = serialNum;
		this.model = model;
	}
	
	public void carInfo() {
		System.out.println("Â÷¶û ½Ã¸®¾ó ¹øÈ£: " + serialNum);
		System.out.println("Â÷·® ¸ðµ¨: " + model);
	}
}
