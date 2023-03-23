package ch17;

import java.sql.*;
import java.util.Scanner;
public class OraInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
		Connection conn = null; Statement stmt = null; 
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요");
		// 문자와 숫자를 반복해서 입력할 경우는 문자로 읽어서 숫자로 형변환하여야 한다
		int deptno = Integer.parseInt(sc.nextLine()); 
		System.out.println("부서명을 입력하세요");
		String dname = sc.nextLine();
		System.out.println("근무지를 입력하세요");
		String loc = sc.nextLine();
		// 조회할 결과를 저장하는 것이 resultset이다. rs는 저장할 필요가 없으므로 선언하지 않음.
//		값이 숫자일 때는 그냥 사용, 문자열일 때는 앞뒤로 작은 따옴표
//		String sql = "insert into dept values("+deptno+", '" + dname + "', '" + loc + "')";
		String sql = String.format("insert into dept values(%d, '%s', '%s')", deptno, dname, loc);
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
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
