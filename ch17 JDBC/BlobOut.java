package ch17;
import java.sql.*;
import java.io.*;
public class BlobOut {
	public static void main(String[] args) throws SQLException {
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; 
		String sql = "select photo from test where id = 'a1'";
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			File file = new File("kk.jpg");
			Class.forName(driver);
			conn = DriverManager.getConnection(url, "c##scott", "tiger");
			pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
			if(rs.next()) {
				Blob blob = rs.getBlob("photo"); // 1과 photo 둘다 가능
				InputStream is = blob.getBinaryStream();
//				kk.jpg라는 파일을 만들었다. 현재는 데이터는 없는 빈 파일
				FileOutputStream fos = new FileOutputStream(file);
				byte[] buffer = new byte[1024];
				int i = 0;
//				 		   한번에 1024byte 읽음
				while((i = is.read(buffer)) != -1) { // -1은 더 이상 데이터 없다, 파일 끝
					fos.write(buffer,0,i);
				}
				is.close(); fos.close(); rs.close();
				System.out.println("그림을 출력하였습니다.");
			} else System.out.println("그림이 존재하지 않습니다.");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			pstmt.close(); conn.close();
		}
		
	}

}
