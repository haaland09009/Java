package ch02;

public class Ex01 {
	public static void main(String[] args) {
		int numOfApples = 123; // 사과의 갯수
		int sizeofBucket = 10;
		// 바구니의 크기(바구니에 담을 수 있는 사과의 갯수)
		int numOfBucket = (numOfApples % sizeofBucket == 0) ? numOfApples / sizeofBucket : numOfApples / sizeofBucket + 1; 
		System.out.println("바구니 갯수 : " + numOfBucket);
		
	}

}
