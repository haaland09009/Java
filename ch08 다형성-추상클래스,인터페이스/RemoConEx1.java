package ch08;

public class RemoConEx1 {
	public static void main(String[] args) {
//		인터페이스는 배열을 통해서 객체 생성?? - > 어제 복습 때 확인하기 안에 내용물이 클래스가 있어야함
		RemoteControl[] rc = new RemoteControl[2];
		rc[0] = new Tv1();
		rc[1] = new Radio1();
		for (int i = 0; i < rc.length; i++) {
			rc[i].turnOn();
			rc[i].turnOff();
			rc[i].setMute(false);
			RemoteControl.changeBattery();
			System.out.println("최대볼륨 : " + RemoteControl.MAX_VOLUME);
			System.out.println("최소볼륨 : " + RemoteControl.MIN_VOLUME);
		}
	}

}
