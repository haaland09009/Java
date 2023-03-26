package ch17;
import java.sql.*;
import java.util.Scanner;
// mysql에서 7369 사번의 테이블 삭제
public class MyDelete {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null; PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 사번을 입력하세요.");
		int empno = sc.nextInt(); 
		String sql = "delete from emp where empno = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, empno);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("삭제하였습니다.");
			else System.out.println("삭제에 실패하였습니다."); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			pstmt.close(); conn.close();
		}
		sc.close();
	}

}
