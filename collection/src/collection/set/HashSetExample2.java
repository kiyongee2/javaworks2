package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {

	public static void main(String[] args) {
		
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("오지능", 30));  //인스턴스는 다르지만 내용이 같으므로
		set.add(new Student("오지능", 30));  //객체 1개만 저장
		
		System.out.println("총 객체수: " + set.size());
		
	}
}
