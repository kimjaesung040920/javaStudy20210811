package a2_����;

public class MyInfo {

	public static void main(String[] args) {
		 /** <�ڷ���>
	     * ����(boolean) = true, false
	     * boolean ������ = true;
	     * boolean ������ = false;
	     * 
	     * 
	     * ������(char) ĳ���� = a~z, �ѱ�(1���ڸ�)
	     * char ������ = 'a';
	     * char ������ = '��';
	     * char ������ = '1';
	     * char ������ = '$';
	     * 
	     * ���ڿ��ڷ���(String) ��Ʈ�� = "���ڿ��� �����Ҽ� �ֽ��ϴ�"
	     * String ������ = "�ȳ��ϼ���. ���缺�Դϴ�.";
	     * 
	     * ������(int) Integer = 0 ~ 10 �������� ǥ��
	     * int ������ = 100;
	     * 
	     * 
	     * �Ǽ���(double) = 0.0 ~ 0.9999 �Ǽ�����(�Ҽ���) ǥ��	
	     * double ������ = 100.08776;
	     *
	     */
		
		 // ���������� ������� �� �⵵�� �����ϴ� year����
		 // ���������� ���� �����ϴ� month����
		 // ���������� ���� �����ϴ� day����
		 int year = 2004;
		 int month = 9;
		 int day = 20;
		 // �̸��� ���������� ǥ�� �������� f,s,th
		 // �÷� left, right ���� �Ǽ������� ���� ����
		 // ���� ���� maleFemale������ ���� true, ���� false;
         char f= '��';
         char s= '��';
         char th= '��';
         String name = "���缺";
         // ������� 0000�� 00�� 00��
		 // �̸�: ���缺
		 // �÷�(R): 0.2 
		 // �÷�(L): 0.1
		 // ����: true
         double R= 0.2;
         double L= 0.1;
         boolean maleFemale = true;
         
		 System.out.print("�������: ");
         System.out.print(year);
         System.out.print("��: ");
         System.out.print(month);
         System.out.print("��: ");
         System.out.print(day);
         System.out.println("��: ");
        
         System.out.print("�̸�: ");
         System.out.print(f);
         System.out.print(s);
         System.out.print(th);
         System.out.println(name);
         
         System.out.print("�÷�: ");
         System.out.print(R);
         System.out.println(L);
         
         System.out.print("����: ");
         System.out.println(maleFemale);
         
       
         
	}

}
