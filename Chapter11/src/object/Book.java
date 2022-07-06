package object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public int hashCode() {
		return bookNumber;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj;  //강제 타입 변환
			if(this.bookNumber == book.bookNumber)
				return true;
		}
		return false;
	}
	
	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}
}
