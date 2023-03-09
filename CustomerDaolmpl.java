package customer;
// DTO 형식으로 전달받은 데이터를 DB에 저장(map에 저장, 프로그램 종료하면 사라진다) 저장/조회/수정/삭제
import java.util.HashMap;
import java.util.Map;

public class CustomerDaolmpl {  // DAO Data Access Object
	private Map<String, Customer> map = new HashMap<>();

	public Customer select(String id) {
		return map.get(id); // id에 해당하는 값 customer
	}

	public int insert(Customer customer) {
		map.put(customer.getId(), customer);
		return 1;
	}

}
