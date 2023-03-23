package ch17;

import java.sql.*;
import java.util.Scanner;

public class MyInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Connection conn = null; Statement stmt = null;
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		String deptno = sc.nextLine();
//		String deptno = sc.nextLine(); 이건 괜찮다. 에러가 나지 않는다. 밑에 %s로 바꿔주면 된다. 알아서 숫자로 인식한다.
		System.out.println("부서명을 입력하세요");
		String dname = sc.nextLine();
		System.out.println("근무지를 입력하세요");
		String loc = sc.nextLine();
		
		String sql = String.format("insert into dept values(%s, '%s', '%s')", deptno, dname, loc);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql");
			stmt = conn.createStatement();
//			입력/수정/삭제는 executeUpdate, 성공한 개수를 반환한다.
			int result = stmt.executeUpdate(sql);
			if (result > 0) System.out.println("입력에 성공하였습니다"); // result == 1이지만 result > 0 을 권장한다.
			else System.out.println("입력에 실패하였습니다");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			
		} finally {
			stmt.close(); conn.close(); 
		}
		
		
		sc.close();
		
	}

}
