package ch17;
import java.sql.*;
import java.util.Scanner;
public class OraUpdate {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		Connection conn = null;
		PreparedStatement pstmt = null; // sql문을 좀 더 원활하게 사용하기 위함
		// 입력 수정 삭제는 preparedstatement 선호
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 부서코드를 입력하세요");
		int deptno = Integer.parseInt(sc.nextLine());
		
		System.out.println("수정할 부서명을 입력하세요");
		String dname = sc.nextLine();
		
		System.out.println("수정할 근무지를 입력하세요");
		String loc = sc.nextLine();
		
		// preparedStatement를 사용하면 ?에 데이터를 넣는 형식으로 사용 (Statement 클래스의 Stringformat과 차이점 보기)
		String sql = "update dept set dname = ?, loc = ? where deptno = ?";
		
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			pstmt = conn.prepareStatement(sql); // sql문장 추가, stmt = conn.createStatement();과 차이 확인하기
			pstmt.setString(1,  dname); // 첫번째 ?에 문자열 dname 대입
			pstmt.setString(2,  loc); // 두번째 ?에 문자열 loc
			pstmt.setInt(3, deptno); // 세번째 ?에 숫자 deptno
			int result = pstmt.executeUpdate(); // sql 문장을 제거
			if (result > 0) System.out.println("수정되었습니다");
			else System.out.println("수정에 실패하였습니다"); // 수정하지 못한 경우, exception과 else는 같은 것이 아니라는 것 인지하기
			
		} catch (Exception e) { // sql 문장 또는 table에 문제가 발생한 경우
			System.out.println(e.getMessage());
			
		} finally {
			pstmt.close(); conn.close();
		}
	
		sc.close();
		
		
	}

}
