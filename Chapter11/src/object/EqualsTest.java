package object;

public class EqualsTest {
	public static void main(String[] args) {	
		//equals() 테스트
		String name1 = new String("장그래");
		String name2 = new String("장그래");
		System.out.println(name1 == name2);
		System.out.println(name1.equals(name2));
		
		Book book1 = new Book(100, "미생");
		Book book2 = new Book(100, "미생");
		System.out.println(book1 == book2);
		System.out.println(book1.equals(book2));
		
		System.out.println("****hash()코드 테스트******");
		System.out.println(name1.hashCode());
		System.out.println(name2.hashCode());
		
		System.out.println(book1.hashCode());
		System.out.println(book2.hashCode());
	}
}
