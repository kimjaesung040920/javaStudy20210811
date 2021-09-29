package b22_���������.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class LoginDaoImpl implements LoginDao{
	private DBConnectionMgr pool;
	
	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//�α��� ����
	
	public int login(String id, String password) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		int flag = 0;
		
		try {
			con = pool.getConnection();
			sql = "select count(um.user_id), count(ud.user_password) from"
					+ "user_mst um"
					+ "left outer join user_mst ud on (ud.user_id = um.user_id and ud.user_password = ?"
					+ "where um.user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, password);
			pstmt.setString(2, id);
			try {
				rs = pstmt.executeQuery();
			}	catch (Exception e) {
				   System.out.println("sql��������");
			}

			rs.next();
			flag = rs.getInt(1) + rs.getInt(2);
			
		} catch (ClassNotFoundException e) {
			System.out.println("�����ͺ��̽� Ŭ���� ����̹��� �����ϴ�.");
		} catch (NullPointerException e) {
			System.out.println("sql���� ������ ���� ResultSet�� �������� �ʾҽ��ϴ�.");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return flag;
	}
	@Override
	public String getloginUserName(String id) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		String name = null;
		
		try {
			con = pool.getConnection();
			sql = "select user_name from user_mst where user_id = ?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			
			rs.next();
			name = rs.getString(1);
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			pool.freeConnection(con, pstmt, rs);
		}
		
		return name;
	}
}
