package ch17;
import java.io.*;
import java.sql.*;
public class BlobInsert {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		String sql = "insert into test values('a1',?)";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			File fileName = new File("ioi.jpg");
			int size = (int)fileName.length();
			InputStream is = new FileInputStream(fileName);
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			pstmt.setBinaryStream(1, is, size);
			int result = pstmt.executeUpdate();
			if (result > 0) System.out.println("입력에 성공하였습니다.");
			else System.out.println("입력에 실패하였습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			pstmt.close(); conn.close();
		}
	}
	

}
