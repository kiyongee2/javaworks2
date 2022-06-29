package arraylist;

import java.util.ArrayList;

import array.objectarray.Book;
public class BookArrayList {

	public static void main(String[] args) {
		
		ArrayList<Book> library = new ArrayList<Book>();
		
		Book book1 = new Book("¾Æ¸®¶û1", "Á¶Á¤·¡");
		Book book2 = new Book("¾Æ¸®¶û2", "Á¶Á¤·¡");
		library.add(book1);
		library.add(book2);
		/*
		library.add(new Book("¾Æ¸®¶û1", "Á¶Á¤·¡"));
		library.add(new Book("¾Æ¸®¶û2", "Á¶Á¤·¡"));
		library.add(new Book("¾Æ¸®¶û3", "Á¶Á¤·¡"));
		library.add(new Book("¾Æ¸®¶û4", "Á¶Á¤·¡"));
		library.add(new Book("¾Æ¸®¶û5", "Á¶Á¤·¡"));*/
		
		for(int i=0; i<library.size(); i++) {
			Book book = library.get(i);
			book.showBookInfo();
		}
		
		System.out.println("===Çâ»óµÈ for¹® »ç¿ë===");
		for(Book book : library) {
			book.showBookInfo();
		}
	}

}
