package customer;
// DTO형식으로 전달받은 데이터를 DB저장(map에 저장, 프로그램 종료하면 사라짐) 저장/조회/수정/삭제
import java.util.HashMap;
import java.util.Map;
public class CustomerDaoImpl { // DAO Data Access Object
	private Map<String, Customer> map = new HashMap<>();
	public Customer select(String id) {
		return map.get(id);  // id에 해당하는 값 customer
	}
	public int insert(Customer customer) { // k1,1,k1@k.com,철수,오늘
//		          k1            k1,1,k1@k.com,철수,오늘
		map.put(customer.getId(), customer);
		return 1;
	}

}