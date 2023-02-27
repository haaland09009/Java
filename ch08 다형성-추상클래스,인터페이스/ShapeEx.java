package ch08;

//  !!!  중요  !!!
//오버로딩: 같은 클래스, 생성자/메서드, 매개변수의 갯수가 다르거나 데이터형이 달라야 한다
//오버라이딩: 상속 관계, 메서드, 반환형, 매개변수 갯수, 이름, 데이터형이 일치
//		   부모보다 접근지정자의 범위가 같거나 넓어야 한다 -> 다형성 

public class ShapeEx {
	public static void main(String[] args) {
		Shape[] sh = new Shape[3];
		sh[0] = new Rectangle();
		sh[1] = new Triangle();
		sh[2] = new Circle();
//		draw()라는 메서드를 원/사각형/삼각형 그린다로 다양하게 표현하는 것을 다형성
		for(int i = 0 ; i < sh.length; i++) {
			sh[i].draw();
		}
	}

}
