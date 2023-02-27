package ch08;
//5명 SalaryMan 2명 : 제니 2000000 / 보검 3000000
//HourlyEmployee 3명 : 로제 100, 800  / 차은우 200, 20000 / 하니 300, 10000
//5명에 대하여 급여 계산, 보너스 계산
//xxx의 급여명세서
//급여: xx
//보너스 : xx

public class Employee {
	public final static double INCENTIVE_RATE = 0.1; // final: 바꾸지 않겠는 뜻, 인센티브는 10%로 고정
	private String name;
	Employee() {
		
	}
	
	public String getName() {
		return name;
	}

	Employee(String name) {
		this.name = name;
	}
	int computePay() {   // 재정의해서 사용할 예정
		return 0;
	}
	final int computeIncentive() { // final : 재정의 (overriding) 금지
		int result = 0;
		int pay = computePay();
		if (pay >= 10000) result = (int) (pay * INCENTIVE_RATE);
		return result;
	}

}
