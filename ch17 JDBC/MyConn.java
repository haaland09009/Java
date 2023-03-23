package ch17;

import java.sql.*;

public class MyConn {
	public static void main(String[] args) {
		String driver = "com.mysql.cj.jdbc.Driver"; // url에 적힌 test : 데이터베이스 이름이다
//									ip번호 	 port명 DB명
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		
		try {
			Class.forName(driver); // driver load
			Connection conn = DriverManager.getConnection(url, "root", "mysql"); // 연결
			System.out.println("연결에 성공하였습니다.");
			conn.close(); // 연결 종료
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
