package ch17;
import java.sql.*;
import java.util.Scanner;
public class OraPro2 {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		Connection conn = null; CallableStatement cs = null; 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("조회할 사번을 입력하세요.");
		int empno = sc.nextInt();
		String sql = "{call emp_info(?,?,?)}";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			cs = conn.prepareCall(sql);
			cs.setInt(1, empno); 
//	    procedure에서 out은 registerparameter
	
			cs.registerOutParameter(2, Types.VARCHAR);
			cs.registerOutParameter(3, Types.INTEGER);
			cs.execute(); // in, out이 섞여 있을 때는 실행명령이 execute 명렁어로 실행
			System.out.println("이름 : " + cs.getString(2));
			System.out.println("급여 : " + cs.getInt(3)); // 3번째 물음표
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			cs.close(); conn.close();
		}
		sc.close();
	}

}
