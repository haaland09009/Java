package ch17;

// 업무처리 클래스 (홀 서비스)
// 주문받은 내용을 주방에 전달하고 손님에게 물건을 전달하는 서비스 역할

public class CustomerServiceImpl {	 // Business Logic(Model) 업무 처리
	private static CustomerDaoImpl cd = new CustomerDaoImpl();
	public int insert(Customer customer) { // 입력 성공하면 0 이상, 실패하면 0 반환
		int result = 0;
//		customer는 EX01에서 전달받는 데이터, customer2는 아이디로 데이터베이스에서 읽은 데이터
		Customer customer2 = cd.select(customer.getId());
		if (customer2 == null) 
			result = cd.insert(customer);
		else System.out.println("이미 있는 데이터입니다");
		return result; // 이미 있으면 result = 0이고 입력을 하면 입력한 결과 반환
	}
	
	public int update(Customer customer) {
		int result = 0;
		Customer customer2 = cd.select(customer.getId());
		if (customer2 != null)
			result = cd.update(customer);
		else System.out.println("데이터가 존재하지 않아 수정할 수 없습니다");
		
		return result;
	}
	
	}

