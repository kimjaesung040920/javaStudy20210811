package a9_�޼ҵ�;

import java.util.Scanner;

public class Quiz {
	
	public void quiz1(int starCount) {
		  for(int i = 0; i < 5; i++) {
	        	for(int j = 0; j < 1 + i; j++) {
	        		System.out.print("*");
	        	}
	            System.out.println();
	        }
	        System.out.println();
		
	}
	public void quiz2(int starCount) {
		for(int i = 0; i < 5; i++) {
        	for(int j = 0; j < 5 - i; j++) {
        		System.out.print("*");
        	}
           System.out.println();
        }
        System.out.println();
		
	}
	public void qui3(int starCount) {
	
	public void procStart(String selector, int starCount) {
	    if(selector.equals("1")) {
	        quiz1(starCount);
	    } else if(selector.equals("2")) {
	    	quiz2(starCount);
	    } else if(selector.equals("3")) {
	    	quiz3(starCount);
	    } else if(selector.equals("4")) {
	    	quiz4(starCount);
	    } else {
	    	quiz5(starCount);
	    }
	}
	
    public void mainMenuPrint() {
		System.out.println("[������ ���α׷�]");
	    System.out.println("1. ����1");
	    System.out.println("2. ����2");
	    System.out.println("3. ����3");
	    System.out.println("4. ����4");
	    System.out.println("5. ����5");
	    System.out.println("q. ���α׷� ����");
		}
		
		
	public static void main(String[] args) {
	    Quiz m = new Quiz();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
	while(loopFlag) {	
	    m.mainMenuPrint();
	    System.out.println("����� �Է��Ͻÿ�:");
	    String selector = in.nextLine();
	   
	    
	    if(selector.equals("1") || selector.equals("2") || selector.equals("3")
	    		|| selector.equals("4") || selector.equals("5")) {
	    	
	        System.out.println("����� ���� ������ �Է��ϼ���:");
	        int starCount = in.nextInt();
	        in.nextInt();
	    
	    }else if(selector.equals("q")) {
	    	
	    	System.out.println("���α׷� ������...");
	    	loopFlag = false;
	    	
	    }else {
	    	System.out.println("�߸��� �Է��Դϴ�.");
	    }
	     System.out.println();
	 }
	  System.out.println("���α׷��� ����Ǿ����ϴ�");
	}
}
	
	
	
    /*
     * [����� ���α׷�]
     * 1. ����1
     * 2. ����2
     * 3. ����3
     * 4. ����4
     * 5. ����5
     * q. ���α׷� ����
     * ����� �Է��Ͻÿ�: 1
     * 
     * ����� ���� ������ �Է��ϼ���: 10 (�޼ҵ带 ����ؼ� �����)
     * 
     * void procStart(��� ��ȣ, 10){
     *      if(1���̸�){
     *          void quiz1(���� ����){
     *              for()
     *          }
     *      } else if(2���̸�){
     * 
     *      }
      * }
      * 
      */
    //ù��° �Է�:

