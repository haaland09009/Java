package ch08;

public class RemoConEx2 {
	public static void main(String[] args) {
//		클래스를 생성하지 않고 추상메서드를 재정의해서 객체를 생성할 수 있다
//		객체를 생성하면 참조변수를 사용하여 메서드를 사용
		
//		!!! 추상클래스와 인터페이스는 직접 객체를 생성할 수 없다. 
//		하지만 그 추상클래스와 인터페이스를 구현하는 클래스를 작성한 후에는 객체를 생성할 수 있는 것이다. !!!
//		RemoConEx2$1라는 클래스를 사실 만들어서	그것을 이용하여 객체를 생성한 것임
//		RemoConEx2$1는 무명(익명) (내부, 중첩 Inner) 클래스
		RemoteControl rc = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
				
		}
		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");
		}
		}; // 세미콜론 이유: 객체 생성한 문장 종료
		rc.turnOn(); rc.turnOff(); rc.setMute(false);
		rc.setMute(false);
		RemoteControl.changeBattery();
		System.out.println("최대볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("최소볼륨 : " + RemoteControl.MIN_VOLUME);
	
//		RemoConEx2$2라는 클래스를 사실 만들어서 그것을 이용하여 객체를 생성한 것임 bin 참고
		RemoteControl rc2 = new RemoteControl() {
		@Override
		public void turnOn() {
			System.out.println("스피커를 켭니다");
					
		}
		@Override
		public void turnOff() {
			System.out.println("스피커를 끕니다");
			}	
		};
		rc2.turnOn(); rc2.turnOff(); rc2.setMute(false);
		rc2.setMute(true);
		RemoteControl.changeBattery();
		System.out.println("최대볼륨 : " + RemoteControl.MAX_VOLUME);
		System.out.println("최소볼륨 : " + RemoteControl.MIN_VOLUME);
	}
}
