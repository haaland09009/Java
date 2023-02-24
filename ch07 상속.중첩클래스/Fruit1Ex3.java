package ch07;

public class Fruit1Ex3 {
	public static void main(String[] args) {
//		판매자 2명 구매자 3명
		FruitSeller3 fs1 = new FruitSeller3("제니", 30, 1000);
		FruitSeller3 fs2 = new FruitSeller3("로제", 20, 0);
		FruitBuyer3 fb1 = new FruitBuyer3("보검", 0, 20000);
		FruitBuyer3 fb2 = new FruitBuyer3("은우", 5, 10000);
		FruitBuyer3 fb3 = new FruitBuyer3("화사", 0, 50000);
		
		fb1.buyFruit(fs1, 13000);	
		fb2.buyFruit(fs2, 12000);
		fb3.buyFruit(fs1, 15000);
//								 사과  돈
		fs1.print(); 	// 제니   30   1000  -> 27 4000 -> 25 5000
		fs2.print();	// 로제	 20   0   -> 18 2000
						// 보검   0    20000 -> 3 17000
		fb1.print(); 	// 은우   5    10000  -> 7 8000
 		fb2.print();    // 화사   0    50000  -> 2 48000
		fb3.print();
	}

}
