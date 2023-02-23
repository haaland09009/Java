package ch06;
// Singleton, Design Pattern  프로젝트할때 이거 계속 쓸 예정
//  singleton: 메모리 아낄 수 있음. 
public class Single1 {
//	static이 붙으면 클래스 로딩할 때 딱 1번 실행 -> 클래스 변수
	private static Single1 instance = new Single1();
//	private을 사용하면 외부에서 객체를 생성 못함. 
	Single1() {
		
	}
// 	처음에 생성된 instance를 같이 사용: singleton
// 	객체를 생성할 때는 instasnce를 사용 -> db과목에서 배울 것.
	public static Single1 getInstance() {
		return instance;
	}

}
