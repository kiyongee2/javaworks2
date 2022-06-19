package exercise.q6;

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

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
}

public class LibraryTest {

	public static void main(String[] args) {
		List<Book> bookList = new ArrayList<>();
		
		bookList.add(new Book("�ڹ�", 25000));
		bookList.add(new Book("���̽�", 15000));
		bookList.add(new Book("�ȵ���̵�", 30000));
				
		int totalPrice = bookList.stream().mapToInt(book -> book.getPrice()).sum();
		System.out.println("��� å�� ������ �� : " + totalPrice);
		
		bookList.stream().filter(book -> book.getPrice() >= 20000).map(book -> book.getName())
		                        .sorted().forEach(title -> System.out.println(title));
	}

}
