package ch11;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		// 확장자가 properties로 되어있는 파일을 읽어서 처리할 때 사용
		// 키 = 값으로 구성
		Properties pts = new Properties();
		String path = // database.properties가 있는 파일의 위치와 이름
				PropertiesExample.class.getResource("database.properties").getPath();
		// utf-8 다국어, euc-kr 한글과 영어
		pts.load(new FileReader(path));
	
		
	}

}
