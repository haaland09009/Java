package ch17;
import java.sql.*;
import java.util.Scanner;
public class OraDelete {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		Connection conn = null; PreparedStatement pstmt = null;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 부서코드를 입력하세요.");
		int deptno = sc.nextInt(); // Integer.parseInt(sc.nextLine()); 하나만 입력할 것이ㅁ로 nextInt 사용
		String sql = "delete from dept where deptno = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, deptno);
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
