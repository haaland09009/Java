package ch07;

public class Fruit1Ex {
	public static void main(String[] args) {
//		판매자 2명 구매자 3명
		FruitSeller1 fs1 = new FruitSeller1();
		FruitSeller1 fs2 = new FruitSeller1();
		FruitBuyer1 fb1 = new FruitBuyer1();
		FruitBuyer1 fb2 = new FruitBuyer1();
		FruitBuyer1 fb3 = new FruitBuyer1();
		
		fb1.buyFruit(fs1, 3000);	
		fb2.buyFruit(fs2, 2000);
		fb3.buyFruit(fs1, 2000);
//								 사과  돈
		fs1.print(); 	// fs1   20   0  -> 17 3000 -> 15 5000
		fs2.print();	// fs2	 20   0  -> 18 2000
						// fb1   0    5000 -> 3 2000
		fb1.print(); 	// fb2   0    5000 -> 2 3000
 		fb2.print();    // fb3   0    5000 -> 2 3000
		fb3.print();
	}

}
