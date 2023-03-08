package ch11;
class FruitBox2<T> {
	private T item;
	public void store(T item) { // 넣다
		this.item = item;
	}
	public T pullOut() { // 꺼내다
		return item;
	}
}

// 제네릭스 사용하면 컴파일하기 이전에 에러를 미리 알수 있다.
public class FruitBox1Ex2 {
	public static void main(String[] args) {
		FruitBox2<Orange> fb = new FruitBox2<>();
		fb.store(new Orange(10));
		Orange orange = (Orange) fb.pullOut();
		orange.showSugar();
		// Generics 사용하면 컴파일할 때 에러발생
//		컴파일할 때는 문제가 발생하지 않았지만 실행할 때 에러
//		fb.store(new Apple(8));
//		원래 사과를 넣었는데 Orange로 형변환해서 에러 발생
//		Orange og2 = (Orange) fb.pullOut();
//		og2.showSugar();
	}
}
