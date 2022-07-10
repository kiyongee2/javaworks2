package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapSample {

	public static void main(String[] args) {
		//Map ÄÃ·º¼Ç »ý¼º
		Map<String, Integer> map = new HashMap<>();
		
		//°´Ã¼ ÀúÀå
		map.put("ÀÌ¼ø½Å", 85);
		map.put("È«±æµ¿", 90);
		map.put("°­°¨Âù", 80);
		map.put("È«±æµ¿", 75);
		System.out.println("ÃÑ °´Ã¼ ¼ö: " + map.size());
		
		//°´Ã¼ Ã£±â
		System.out.println("\tÈ«±æµ¿: " + map.get("È«±æµ¿"));
		System.out.println();
		
		//°´Ã¼¸¦ ÇÏ³ª¾¿ Ã³¸®
		Set<String> keySet = map.keySet();
		Iterator<String> iterator = keySet.iterator();
		while(iterator.hasNext()) {
			String key = iterator.next();
			Integer value = map.get(key);
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
		
		//°´Ã¼ »èÁ¦
		map.remove("È«±æµ¿");  //Å°·Î Á¦°Å
		System.out.println("ÃÑ °´Ã¼ ¼ö: " + map.size());
	}
}
