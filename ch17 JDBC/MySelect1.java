package ch17;

import java.sql.*;
public class MySelect1 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		String sql = "select ename, job, hiredate from emp";
		System.out.println("이름\t업무\t\t입사일");
		System.out.println("==================================");
		
		Connection conn = null; Statement stmt = null; ResultSet rs = null; 
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.print(rs.getString(1) + "\t");		//  "ename"
				if (rs.getString("job").length() > 7)     // 2
					System.out.print(rs.getString("job") + "\t");  
				else System.out.print(rs.getString("job") + "\t\t");
				System.out.println(rs.getDate(3) + "\t");       // "hiredate"
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally { // 에러 발생여부와 관계없이 무조건 실행
			rs.close(); stmt.clearBatch(); conn.close();
		}
		
	}

}
