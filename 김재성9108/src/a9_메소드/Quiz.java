package a9_메소드;

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
		System.out.println("[별직기 프로그램]");
	    System.out.println("1. 문제1");
	    System.out.println("2. 문제2");
	    System.out.println("3. 문제3");
	    System.out.println("4. 문제4");
	    System.out.println("5. 문제5");
	    System.out.println("q. 프로그램 종료");
		}
		
		
	public static void main(String[] args) {
	    Quiz m = new Quiz();
		Scanner in = new Scanner(System.in);
		boolean loopFlag = true;
		
	while(loopFlag) {	
	    m.mainMenuPrint();
	    System.out.println("명령을 입력하시요:");
	    String selector = in.nextLine();
	   
	    
	    if(selector.equals("1") || selector.equals("2") || selector.equals("3")
	    		|| selector.equals("4") || selector.equals("5")) {
	    	
	        System.out.println("출력할 별의 개수를 입력하세요:");
	        int starCount = in.nextInt();
	        in.nextInt();
	    
	    }else if(selector.equals("q")) {
	    	
	    	System.out.println("프로그램 종료중...");
	    	loopFlag = false;
	    	
	    }else {
	    	System.out.println("잘못된 입력입니다.");
	    }
	     System.out.println();
	 }
	  System.out.println("프로그램이 종료되었습니다");
	}
}
	
	
	
    /*
     * [별찍기 프로그램]
     * 1. 문제1
     * 2. 문제2
     * 3. 문제3
     * 4. 문제4
     * 5. 문제5
     * q. 프로그램 종료
     * 명령을 입력하시요: 1
     * 
     * 출력할 별의 개수를 입력하세요: 10 (메소드를 사용해서 만들기)
     * 
     * void procStart(명령 번호, 10){
     *      if(1번이면){
     *          void quiz1(별의 개수){
     *              for()
     *          }
     *      } else if(2번이면){
     * 
     *      }
      * }
      * 
      */
    //첫번째 입력:

