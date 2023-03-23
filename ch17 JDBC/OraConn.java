package ch17;

import java.sql.*;

public class OraConn {
	// 밑에 작성된 코드는 외울 필요는 없다.
	public static void main(String[] args) {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; // oracle 정식버전 xe -> orcl
		try {
			Class.forName(driver);
			Connection conn = DriverManager.getConnection(url, "c##scott", "tiger");
			System.out.println("연결에 성공하였습니다.");
			conn.close();
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
