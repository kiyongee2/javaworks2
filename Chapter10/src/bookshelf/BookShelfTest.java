package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQueue = new BookShelf();    //�������̽� Ÿ������ ��ü ����
		shelfQueue.enQueue("�̻�1");
		shelfQueue.enQueue("�̻�2");
		shelfQueue.enQueue("�̻�3");
		
		System.out.println("���� ����Ʈ�� ���� " + shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
