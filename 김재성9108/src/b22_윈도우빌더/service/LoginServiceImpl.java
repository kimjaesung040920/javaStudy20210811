package b22_孺紫辦網渦.service;

import b22_孺紫辦網渦.dao.LoginDao;
import b22_孺紫辦網渦.dao.LoginDaoImpl;

/**
 * 
 * 
 * 
 * 
 * 
 *
 */

public class LoginServiceImpl implements LoginService{
	private LoginDao loginDao;
	
	public LoginServiceImpl() {
		loginDao = new LoginDaoImpl();
	}
	
	@Override
	public int loginTextCheck(String id, String pwd) {
		int flag = 0;
		
		if(id.length() == 0) {
			flag = 3;
		}else if(pwd.length() == 0) {
			flag = 4;
		}else {
			flag = loginLogic(id, pwd);
		}
		
		return flag;
	}
	
	@Override
	public int loginLogic(String id, String pwd) {
		return loginDao.login(id, pwd);
	}
}