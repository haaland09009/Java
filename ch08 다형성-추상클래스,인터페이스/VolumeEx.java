package ch08;

public class VolumeEx {
	public static void main(String[] args) {
		// 인터페이스를 사용하면 상속처럼 배열로 처리할 수 있습니다.
		// 클래스들끼리 서로 관계를 맺어줌		
		Volume[] vols = new Volume[3];
		vols[0] = new TV();
		vols[1] = new Radio();
		vols[2] = new Speaker();
		
		for(Volume vol : vols) {
			vol.volumeUp();
			vol.volumeDown();
			
		}
	}

}
