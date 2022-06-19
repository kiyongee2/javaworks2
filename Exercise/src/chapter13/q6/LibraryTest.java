package chapter13.q6;

import java.util.ArrayList;
import java.util.List;

class Book{
	private String name;
	private int price;
	
	public Book(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
		
		//��Ʈ�� �����ϰ� ����ϱ�
		int total = bookList.stream().mapToInt(b -> b.getPrice()).sum();
		System.out.println("��� å�� ������ �� : " + total + "�� �Դϴ�.");
		
		System.out.println("å�� ������ 20,000�� �̻��� å�� �̸��� �����Ͽ� ���");
		bookList.stream().filter(b -> b.getPrice() >= 20000).map(b ->b.getName())
				.sorted().forEach(s->System.out.println(s));

	}

}
