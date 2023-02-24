package ch07;

public class CarEx {
	public static void main(String[] args) {
		Ambulance am = new Ambulance("구급차", 5);
		Bus b = new Bus("버스", 40);
		FireEngine f  = new FireEngine("불자동차", 10);
		
		am.printAm();
		b.printBus();
		f.printFe();
	}

}
