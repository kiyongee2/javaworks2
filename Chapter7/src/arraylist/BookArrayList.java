package arraylist;

import java.util.ArrayList;

import array.objectarray.Book;
public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<Book> library = new ArrayList<Book>();
		Book book1 = new Book("�Ƹ���1", "������");
		library.add(book1);
		/*
		library.add(new Book("�Ƹ���1", "������"));
		library.add(new Book("�Ƹ���2", "������"));
		library.add(new Book("�Ƹ���3", "������"));
		library.add(new Book("�Ƹ���4", "������"));
		library.add(new Book("�Ƹ���5", "������"));*/
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println("===���� for�� ���===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
