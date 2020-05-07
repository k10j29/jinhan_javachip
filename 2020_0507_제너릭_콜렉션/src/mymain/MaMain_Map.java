package mymain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaMain_Map {

	public static void main(String[] args) {

		Map<Integer, String> telMap = new HashMap<Integer, String>(); // (Key, Value) 한쌍으로 저장되는 Map

		// Key 는 Set 으로 저장 관리

		// Set 의 특징은 순서없이 저장되고, 중복값을 허용하지않음

		// == key 값에는 중복값이 올수없다

		telMap.put(1, "010-1234-1111"); // 단축 번호 1번에, 번호는 010-1111-1111
		telMap.put(2, "010-1234-2111");
		telMap.put(3, "010-1234-3111");
		telMap.put(4, "010-1234-4111");
		telMap.put(5, "010-1234-5111");

		// Map 안에 있는 Key값들 얻어오기

		Set<Integer> keySet = telMap.keySet();

		for (Integer key : keySet) { //개선loop

			System.out.printf("단축번호 [%d]: [%s]\n", 
										key,  telMap.get(key)); 

		}

	}

}
