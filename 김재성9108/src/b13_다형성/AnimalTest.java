package b13_������;

import b12_���.Animal;
	
class Human extends Animal {
	public void readBook() {
		System.out.println("����� å�� �н��ϴ�.");
	}
	@Override
	public void move() {
		System.out.println("����� �ι߷� �Ƚ��ϴ�.");
	}
}

class Tiger extends Animal {
	public void hunting() {
		System.out.println("ȣ���̰� ����� �մϴ�.");
	}
	@Override
	public void move() {
		System.out.println("ȣ���̰� �׹߷� �ݴϴ�.");
	}
}

class Eagle extends Animal {
	public void flying() {
		System.out.println("�������� ������ �� ��� �ָ� ���ư��ϴ�.");
	}
	@Override
	public void move() {
		System.out.println("�������� �ϴ��� ���ϴ�.");
	}
}

public class AnimalTest {
	
	Animal[] list = new Animal[3];
	
	public void addAnimal() {
		list[0] = new Human();
		list[1] = new Tiger();
		list[2] = new Eagle();
	}
	
	public void animalMove() {
		for(Animal ani : list) {
			ani.move();
		}
	}
	
	public void casting() {
		for(Animal ani : list) {
			if(ani == null) {
				continue;
			}
			if(ani instanceof Human) {
				Human h = (Human)ani;
				h.readBook();
			}else if(ani instanceof Tiger) {
				Tiger h = (Tiger)ani;
				h.hunting();
		    }else if(ani instanceof Eagle) {
		    	Eagle h = (Eagle)ani;
		    	h.flying();
		    }else {
		    	System.out.println("�������� �ʴ� �ڷ����Դϴ�.");
		    }
		}	
	}
	
	public static void main(String[] args) {
		AnimalTest aniTest = new AnimalTest();
		
		// ��ĳ���� Animal <- Human, Tiger, Eagle
		aniTest.addAnimal();
		aniTest.animalMove();
		
		System.out.println("-------------------");
		
		// �ٿ�ĳ����
		aniTest.casting();
		
		
	}
}

