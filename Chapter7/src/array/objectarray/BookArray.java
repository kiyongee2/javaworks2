package array.objectarray;

public class BookArray {

	public static void main(String[] args) {
		Book[] library = new Book[5];
		int i;
		
//		for(i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}
		
		library[0] = new Book("�Ƹ���1", "������");
		library[1] = new Book("�Ƹ���2", "������");
		library[2] = new Book("�Ƹ���3", "������");
		library[3] = new Book("�Ƹ���4", "������");
		library[4] = new Book("�Ƹ���5", "������");
		
		for(i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		for(i=0; i<library.length; i++) {
			library[i].showBookInfo();
		}
		
//		library[0] = new Book("�̻�1", "����ȣ");  //���� ����
//	
//		for(Book book : library) {  //���� for
//			book.showBookInfo();
//		}
//		
//		for(i=0; i<library.length; i++) {
//			System.out.println(library[i]);
//		}

	}

}
