package ch11;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// 딸기, 달콤하다 / 수박, 시원하다 / 키위, 시큼하다
// hashmap 입력한 후에 set과 iterator 사용하여 출력


public class Map2 {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("딸기", "달콤하다"); map.put("수박", "시원하다"); map.put("키위", "시큼하다");
		
		Set<String> keys = map.keySet();
		for(String key : keys) {
			System.out.println(key + " : " + map.get(key));
		}
		System.out.println("============");
		
		Iterator<String> its = map.keySet().iterator();
		while(its.hasNext()) {
			String key = its.next();
			System.out.println(key + " : " + map.get(key));
			
		}
	}

}
