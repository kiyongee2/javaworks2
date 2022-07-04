package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);  //리스트에 요소 추가
	}

	@Override
	public String deQueue() {
		//맨 처음 요소를 삭제하고 반환
		return shelf.remove(0);   
	}

	@Override
	public int getSize() {
		//리스트 요소의 개수 반환
		return getCount();
	}

}
