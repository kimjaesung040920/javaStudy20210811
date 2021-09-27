package b20_데이터베이스;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import db.DBConnectionMgr;

public class LoginDaoImpl implements LoginDao{
	private DBConnectionMgr pool;
	
	public LoginDaoImpl() {
		pool = DBConnectionMgr.getInstance();
	}
	
	//로그인 로직
	
	public int login(String id, String password) {
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
