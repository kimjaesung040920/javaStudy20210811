package b16_기본클래스;

import java.util.Objects;

public class Car {
	private int carNumber;
	private String model;
	public Car(int carNumber, String model) {
		super();
		this.carNumber = carNumber;
		this.model = model;
	}
	
	public int getCarNumber() {
		return carNumber;
	}

	public String getModel() {
		return model;
	}

	@Override
	public int hashCode() {
		return Objects.hash(carNumber, model);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		return carNumber == other.carNumber && Objects.equals(model, other.model);
	}
	
	
	/*
	@Override
	public int hashCode() {
		return carNumber;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(this.hashCode() == obj.hashCode()) {
			flag = true;
		}
		return false;
	}
	*/
}
