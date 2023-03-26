package ch17;

import java.sql.*;
import java.util.Scanner;

// mysql emp 테이블 사번이 7369에 해당하는 empno 이름을 보검, 업무를 배우로 수정
public class MyUpdate {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("수정하고 싶은 사번을 입력하세요.");
		int empno = Integer.parseInt(sc.nextLine());
		
		System.out.println("사원명을 어떻게 수정하고 싶으신가요?");
		String ename = sc.nextLine();
		
		System.out.println("업무를 어떻게 수정하고 싶으신가요?");
		String job = sc.nextLine();
		
	    String sql = "update emp set ename = ?, job = ? where empno = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			pstmt = conn.prepareStatement(sql); 
			pstmt.setString(1, ename); 
			pstmt.setString(2,  job); 
			pstmt.setInt(3,  empno); 
			int result = pstmt.executeUpdate(); 
			if (result > 0) System.out.println("수정되었습니다");
			else System.out.println("수정에 실패하였습니다"); 
			
		} catch (Exception e) { // sql 문장 또는 table에 문제가 발생한 경우
			System.out.println(e.getMessage());
			
		} finally {
			pstmt.close(); conn.close();
		}
	
		sc.close();
	}

}
