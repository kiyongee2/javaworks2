package object;

import java.util.Date;

public class ToStringExample {
	public static void main(String[] args) {
		String name = new String("ȫ�浿");
		System.out.println(name);
		System.out.println(name.toString());
		
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		
		Date date = new Date();
		System.out.println(date.toString());
		
		Book book = new Book(100, "����");
		System.out.println(book);
		System.out.println(book.toString());
	}
}
