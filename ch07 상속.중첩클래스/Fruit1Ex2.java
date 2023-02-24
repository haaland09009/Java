package ch07;

public class Fruit1Ex2 {
	public static void main(String[] args) {
//		판매자 2명 구매자 3명
		FruitSeller2 fs1 = new FruitSeller2("제니", 30, 1000);
		FruitSeller2 fs2 = new FruitSeller2("로제", 20, 0);
		FruitBuyer2 fb1 = new FruitBuyer2("보검", 0, 20000);
		FruitBuyer2 fb2 = new FruitBuyer2("은우", 5, 10000);
		FruitBuyer2 fb3 = new FruitBuyer2("화사", 0, 50000);
		
		fb1.buyFruit(fs1, 3000);	
		fb2.buyFruit(fs2, 2000);
		fb3.buyFruit(fs1, 2000);
//								 사과  돈
		fs1.print(); 	// 제니   30   1000  -> 27 4000 -> 25 5000
		fs2.print();	// 로제	 20   0   -> 18 2000
						// 보검   0    20000 -> 3 17000
		fb1.print(); 	// 은우   5    10000  -> 7 8000
 		fb2.print();    // 화사   0    50000  -> 2 48000
		fb3.print();
	}

}
