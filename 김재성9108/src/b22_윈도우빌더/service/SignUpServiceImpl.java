package b22_���������.service;

import b22_���������.dao.SignUpDao;
import b22_���������.dao.SignUpDaoImpl;

public class SignUpServiceImpl implements SignUpService{
	private SignUpDao signUpDao;
	
	public SignUpServiceImpl() {
		signUpDao = new SignUpDaoImpl();
	}
	
	@Override
	public boolean isEmptyId(String id) {
		return id.length() != 0 ? true : false;
		
	}
	@Override
	public int idCheck(String id) {
		
		// flag == 0 �ߺ�Ȯ�� ����, 1 �ߺ�Ȯ�� ����, 2 �󰪿���
		
		int flag = 2;
		
		if(isEmptyId(id)) {
			// db���� ���̵� �ߺ�Ȯ��
			flag = signUpDao.idCheck(id);
		}
		
		return flag;
	}
	
	@Override
	public String isEmptyValue(String[] values) {
		String msg = null;
		int errorIndex = 100;
		
		for(int i = 0; i < values.length; i++) {
			if(values[i].length() == 0 || values[i].equals("����")) {
				errorIndex = i;
				break;
			}
		}
		
		if(errorIndex == 0) {
			msg = "���̵� �Էµ��� �ʾҽ��ϴ�,";
		}else if(errorIndex == 0) {
			msg = "��й�ȣ�� �Էµ��� �ʾҽ��ϴ�.";
		}else if(errorIndex == 0) {
			msg = "��й�ȣ Ȯ���� �Էµ��� �ʾҽ��ϴ�.";
		}else if(errorIndex == 0) {
			msg = "�̸��� �Էµ��� �ʾҽ��ϴ�.";
		}else if(errorIndex == 0) {
			msg = "����ó�� �Էµ��� �ʾҽ��ϴ�.";
		}else if(errorIndex == 0) {
			msg = "�̸����� �Էµ��� �ʾҽ��ϴ�.";
		}else if(errorIndex == 0) {
			msg = "������ �Էµ��� �ʾҽ��ϴ�.";
		}else {
			msg = "values is not null";
		}
		return msg;
	}
	
	@Override
	public String equalsPassword(String pwd, String repwd) {
		String msg = null;
		
		if(pwd.equals(repwd)) {
			msg = "password equals";
		}else {
			msg = "��й�ȣ�� ��ġ���� �ʽ��ϴ�.\n �ٽ� �Է��ϼ���.";
		}
		
		return msg;
	}
}
