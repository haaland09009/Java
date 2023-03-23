package ch17;

import java.sql.*;
// mysql에 이름,업무,입사일 불러오기

public class OraPractice1 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		
		// 연결할 수 있는 클래스 불러오기
		Connection conn = null; // DB 연결 
		Statement stmt = null; // sql 실행할 객체 생성하는 클래스
		ResultSet rs = null; // 조회한 데이터를 저장하는 클래스
		String sql = "select ename, job, hiredate from emp";
	
		
		try {
			Class.forName(driver); // driver load
			conn = DriverManager.getConnection(url,"root", "mysql"); // db연결
			stmt = conn.createStatement(); // 실행할 객체 생성
//			조회 : executeQuery, 입력/수정/삭제 : executeUpdate
			rs = stmt.executeQuery(sql); // sql을 실행하고 그 결과를 rs에 저장
			while(rs.next()) { // 포인터 다음에 있는 데이터를 읽어서 읽히면 true, 못 읽으면 false
				System.out.println("이름 : " + rs.getString("ename")); // 1
				System.out.println("업무: " + rs.getString("job")); // 2  = "dname"
				System.out.println("입사일: " + rs.getDate("hiredate")); // 3
				System.out.println("=========================");
			}
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			rs.close(); stmt.close(); conn.close();
			
		}
	}

}
