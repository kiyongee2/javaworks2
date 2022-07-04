package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		
		//인터페이스 타입으로 객체 생성
		Queue shelfQueue = new BookShelf();    
		
		//자료 삽입
		shelfQueue.enQueue("반응형 웹");
		shelfQueue.enQueue("혼공 Java");
		shelfQueue.enQueue("스프링부트");
		
		//자료의 개수
		System.out.println("현재 리스트의 개수 " + shelfQueue.getSize());
		
		//자료 출력
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
