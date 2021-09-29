package b20_데이터베이스;

import java.util.Scanner;

public class LoginTest {
	
	public static void main(String[] args) {
		LoginDao loginDao = new LoginDaoImpl();
		
		Scanner input = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("=====로그인 시스템=====");
			System.out.println("아이디: ");
			String id = input.nextLine();
		
			System.out.println("비밀번호: ");
			
			String passsword = input.nextLine();
			
			int flag = loginDao.login(id, passsword);
			
			if(flag == 0) {
				System.out.println("존재하지 않는 아이디 입니다.");
			}else if(flag == 1) {
				System.out.println("비밀번호가 틀렸습니다. 다시 시도해주세요.");
			}else if(flag == 2) {
				String name = loginDao.getloginUserName(id);
				System.out.println("로그인 성공. 환영합니다.");
			}else {
				System.out.println("데이터 베이스 오류.");
			}
		}
	}
	
	
	
	
}
