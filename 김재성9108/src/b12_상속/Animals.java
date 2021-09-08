package b12_���;

public class Animals {
	public static void main(String[] args) {
		Human h = new Human();
		Tiger t = new Tiger();
		Eagle e = new Eagle();
		
		h.move();
		t.move();
		e.move();
		
		Animal[] a = new Animal[3];
		a[0] = new Human();
		a[1] = new Tiger();
		a[2] = new Eagle();
		
		for(Animal ani : a) {
			ani.move();
		}
	}

}

class Human extends Animal {
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
	 
}

class Eagle extends Animal {
	@Override
	public void move() {
		System.out.println("�������� ������ ��� ���ϴ�.");
	}
}
