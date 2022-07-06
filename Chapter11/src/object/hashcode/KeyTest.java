package object.hashcode;

import java.util.HashMap;

public class KeyTest {

	public static void main(String[] args) {
		//HashMap 객체 생성
		//Key 객체를 식별키로 String 값을 저장함
		HashMap<Key, String> hashMap = new HashMap<>();
		
		//put(key, value)
		hashMap.put(new Key(1), "알파고");
		
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
