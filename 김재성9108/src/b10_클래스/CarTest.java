package b10_Ŭ����;

public class CarTest {

	public static void main(String[] args) {
	Car sonata = new Car();	
	Car k7 = new Car();
	Car tesla_model3 = new Car();
	
     	sonata.setCompany("�����ڵ���");
		k7.setCompany("KIA�ڵ���");
		tesla_model3.setModel("tesla");
		
		sonata.setModel("�ҳ�Ÿ");
	    k7.setModel("k7");
		tesla_model3.setModel("model3");
		
		sonata.carInfo();
		k7.carInfo();
		tesla_model3.carInfo();
		
		
		
	    // sonata ������
		//������: �����ڵ���
		//��: �ҳ�Ÿ
		//����: ��
		//����: 2019
		
		// k7
		// ������: KIA�ڵ���
		// ��: k7
		// ����: ȭ��Ʈ
		// ����: 2020
		
		// tesla_model3
		// ������: tesla
		// ��: model3
		// ����: ȭ��Ʈ
		// ����: 2021
		
		
		
		
		
		
		
		
		}

}
