package ch17;
import java.sql.*;
// oracle에 테이블 생성하기
//create table customer (
//		  id varchar2(20) primary key,
//		  pass varchar2(20),
//		  email varchar2(20),
//		  name varchar2(20),
//		  reg_date date
//		);
//		desc customer;
// db연결을 위해 생성한 클래스 (주방),  DB 입력/수정/삭제/조회,  실제로 만드는 장소
public class CustomerDaoImpl { 
	public Connection getConnection() { // 한 번 연결하면 입력/수정/삭제/조회 공용
		Connection conn = null; // static : 객체를 생성하지 않고 바로 쓸 수 있다. private static Connection conn = null;도 가능
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			
		} catch (Exception e) {
			System.out.println("연결 에러발생 : " + e.getMessage());
		}
		return conn;
	}
	public Customer select(String id) {  // 한건만 조회하는 것
		Customer customer = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from customer where id = ?";
		// 이제 연결시켜야함
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()) { // 데이터가 있으면 채우고 없으면 null이 전달된다
				customer = new Customer();
				customer.setId(rs.getString("id"));
				customer.setPass(rs.getString("pass"));
				customer.setEmail(rs.getString("email"));
				customer.setName(rs.getString("name"));
			   } 
			} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (rs != null) rs.close();
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {   }
		}
		return customer;
	}
	public int insert(Customer customer) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "insert into customer values(?,?,?,?,sysdate)";
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getId());
			pstmt.setString(2, customer.getPass());
			pstmt.setString(3, customer.getEmail());
			pstmt.setString(4, customer.getName());
			result = pstmt.executeUpdate(); // 성공한 개수
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {   }
		}
		return result;
	}
	public int update(Customer customer) {
		int result = 0;
		PreparedStatement pstmt = null;
		String sql = "update customer set pass = ?, email = ?, name = ? where id = ? ";
		Connection conn = getConnection();
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, customer.getId());
			pstmt.setString(2, customer.getPass());
			pstmt.setString(3, customer.getEmail());
			pstmt.setString(4, customer.getId());
			result = pstmt.executeUpdate(); // 성공한 개수
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			try {
				if (pstmt != null) pstmt.close();
				if (conn != null) conn.close();
			} catch (Exception e) {   }
		}
		return result;
}
}

