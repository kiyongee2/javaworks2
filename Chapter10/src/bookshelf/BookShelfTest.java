package bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		
		//�������̽� Ÿ������ ��ü ����
		Queue shelfQueue = new BookShelf();    
		
		//�ڷ� ����
		shelfQueue.enQueue("������ ��");
		shelfQueue.enQueue("ȥ�� Java");
		shelfQueue.enQueue("��������Ʈ");
		
		//�ڷ��� ����
		System.out.println("���� ����Ʈ�� ���� " + shelfQueue.getSize());
		
		//�ڷ� ���
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
	}
}
