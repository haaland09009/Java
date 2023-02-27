package ch08;
//5명 SalaryMan 2명 : 제니 2000000 / 보검 3000000
//HourlyEmployee 3명 : 로제 100, 800  / 차은우 200, 20000 / 하니 300, 10000
//5명에 대하여 급여 계산, 보너스 계산
//xxx의 급여명세서
//급여: xx
//보너스 : xx

public class SalaryMan extends Employee {
	private int annualSalary;
	SalaryMan(String name, int annualSalary) {
		super(name); this.annualSalary = annualSalary;
	}
	int computePay() {   // 재정의해서 사용할 예정
		return annualSalary / 12;
	}
//	computeIncentive() { // 재정의(overriding) 금지 final은 재정의 금지

}
