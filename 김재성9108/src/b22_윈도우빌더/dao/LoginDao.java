package b22_���������.dao;

import b22_���������.dto.UserDto;

public interface LoginDao {
	public int login(String id, String password);
	public String getloginUserName(String id);
	public UserDto getUserDto(String id);
}
