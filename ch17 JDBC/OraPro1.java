package ch17;
import java.sql.*;
import java.util.Scanner;
public class OraPro1 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		Connection conn = null;
		CallableStatement cs = null; // 프로시저 쓰는 명령
		
		Scanner sc = new Scanner(System.in);
		System.out.println("부서코드를 입력하세요.");
		
		int deptno = Integer.parseInt(sc.nextLine());
		System.out.println("부서명을 입력하세요.");
		
		String dname = sc.nextLine();
		System.out.println("근무지를 입력하세요");
		String loc = sc.nextLine();
		
		String sql = "{call insert_dept(?,?,?)}";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, deptno);
			cs.setString(2,  dname);
			cs.setString(3,  loc);
			int result = cs.executeUpdate();
			if (result > 0) System.out.println("입력에 성공하였습니다");
			else System.out.println("입력에 실패하였습니다");
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			cs.close(); conn.close();
		}
		sc.close();
		
	}

}
