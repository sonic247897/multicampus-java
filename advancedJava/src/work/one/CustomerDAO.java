package work.one;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerDAO {
	public int insert(CustomerDTO customer) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		// 등록일 = 오늘, 기본 포인트 = 1000
		String sql ="insert into CUSTOMER values(?,?,?,sysdate,1000,?)";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, customer.getId());
			ptmt.setInt(2, customer.getPass());
			ptmt.setString(3, customer.getName());
			ptmt.setString(4, customer.getAddr());
			result = ptmt.executeUpdate(); 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int update(String id, String addr) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql ="update CUSTOMER set addr = ? where id = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, addr);
			ptmt.setString(2, id);
			result = ptmt.executeUpdate(); 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
	
	public int delete(String id) {
		Connection con = null;
		PreparedStatement ptmt = null;
		int result = 0;
		String sql ="delete CUSTOMER where id = ?";
		try {
			con = DBUtil.getConnect();
			ptmt = con.prepareStatement(sql);
			ptmt.setString(1, id);
			result = ptmt.executeUpdate(); 
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtil.close(null, ptmt, con);
		}
		return result;
	}
}
