package a5_������;

public class Operation2 {

	public static void main(String[] args) {
        //�� ������
		// AND(&&) = ��
		// OR(||) = ��
		// NOT(!) = ����
		
		// true(1) && false(0) => false(0)
		// &&���꿡�� false�� ����� ��������? ���߿� �ϳ��� 0�̸� �ȴ�.
		//          true�� ����� ��������? �Ѵ� 1�̿��� �Ѵ�.
		
		// true(1) || false(0) => true(1)
		// ||���꿡�� false�� ����� ��������? �Ѵ� 0�̿��� �Ѵ�.
		//          true�� ����� ��������? ���� �ϳ��� 1�̸� �ȴ�.
		
		// !�� �տ� ������ true -> false ������ �̷������.
		       
		System.out.println(!(true || false));
		
	}

}
