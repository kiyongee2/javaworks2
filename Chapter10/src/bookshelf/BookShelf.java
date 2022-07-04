package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		shelf.add(title);  //����Ʈ�� ��� �߰�
	}

	@Override
	public String deQueue() {
		//�� ó�� ��Ҹ� �����ϰ� ��ȯ
		return shelf.remove(0);   
	}

	@Override
	public int getSize() {
		//����Ʈ ����� ���� ��ȯ
		return getCount();
	}

}
