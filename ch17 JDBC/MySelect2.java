package ch17;

import java.sql.*;
import java.util.Scanner;

// 사번을 받아서 이름, 입사일, 부서명
public class MySelect2 {
	public static void main(String[] args) throws SQLException {
		String driver = "com.mysql.cj.jdbc.Driver"; 
		String url = "jdbc:mysql://127.0.0.1:3306/test?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
		Scanner sc = new Scanner(System.in);
		
		Connection conn = null; Statement stmt = null; ResultSet rs = null;
		System.out.println("보고 싶은 사번을 입력하세요");
		int empno = sc.nextInt();
		String sql = "select ename, hiredate, dname from emp e, dept d where e.deptno = d.deptno and e.empno = " + empno;
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "root", "mysql"); // url = mysql이 설치된 컴퓨터 정보
			stmt = conn.createStatement(); // stmt에는 url, 아이디, 패스워드를 가진 객체
			rs = stmt.executeQuery(sql);
			if (rs.next()) { // 데이터가 부서코드 당 한건이기 때문에 while문을 작성하지 않아도 된다.
				// while문 돌려서 나중에 해보기
				System.out.println("이름 : " + rs.getString("ename"));
				System.out.println("입사일 : " + rs.getDate("hiredate"));
				System.out.println("부서명 : " + rs.getString("dname"));
			} else System.out.println("없는 사원입니다.");
		} catch(Exception e) {
			System.out.println(e.getMessage());
		} finally {
			rs.close(); stmt.close(); conn.close();
		}
		sc.close();
	}
}
