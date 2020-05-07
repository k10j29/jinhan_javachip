package mymain;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MaMain_Map {

	public static void main(String[] args) {

		Map<Integer, String> telMap = new HashMap<Integer, String>(); // (Key, Value) �ѽ����� ����Ǵ� Map

		// Key �� Set ���� ���� ����

		// Set �� Ư¡�� �������� ����ǰ�, �ߺ����� �����������

		// == key ������ �ߺ����� �ü�����

		telMap.put(1, "010-1234-1111"); // ���� ��ȣ 1����, ��ȣ�� 010-1111-1111
		telMap.put(2, "010-1234-2111");
		telMap.put(3, "010-1234-3111");
		telMap.put(4, "010-1234-4111");
		telMap.put(5, "010-1234-5111");

		// Map �ȿ� �ִ� Key���� ������

		Set<Integer> keySet = telMap.keySet();

		for (Integer key : keySet) { //����loop

			System.out.printf("�����ȣ [%d]: [%s]\n", 
										key,  telMap.get(key)); 

		}

	}

}
