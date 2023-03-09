package customer;

public class CustomerServicelmpl { // Business Model 업무처리
	private static CustomerDaolmpl cdi = new CustomerDaolmpl();

	public int insert(Customer customer) {
		int result = 0; // 0 은 입력실패, 1은 입력 성공
//		map에 전달된 id를 가지고 읽어서 있으면 이미 있는 아이디입니다. 다른 것을 사용하세요, 없으면 입력
//		customer는 console로 입력 받아서 전달받은 데이터, customer2는 map에서 읽어온 데이터
		Customer customer2 =  cdi.select(customer.getId()); // 입력한 id로 읽기
		if (customer2 == null) result = cdi.insert(customer); // 없으면 아이디 입력하기
		else System.out.println("이미 있는 아이디입니다. 다른 것을 사용하세요");	 // 이미 있은 거 다른 거 입력하라고 지시
		return result;
	}

	public Customer select(String id) {
		return cdi.select(id);
	}

}
