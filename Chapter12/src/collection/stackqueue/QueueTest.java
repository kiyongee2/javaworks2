package collection.stackqueue;

class MyQueue{
	final static int MAX = 100;
	int[] queue;
	int size;
	int front = -1;
	int rear = -1;
	
	//ť ���� �޸� ����
	public MyQueue(int size) {
		this.size = size;
		queue = new int[size];
	}
	
	//ť�� ���� - ��� ����
	public boolean isEmpty() {
		if(front == rear)
			return true;
		else
			return false;
	}
	
	//ť�� ���� - �� �� ����
	public boolean isFull() {
		int tmp = (rear + 1) % MAX;
		if(tmp == front)
			return true;
		else 
			return false;	
	}
	
	//ť�� ������ �߰�
	public void addQueue(int value) {
		if(isFull())
			System.out.println("ť�� �� �� �ֽ��ϴ�.");
		else {
			rear = (rear + 1) % MAX;
			queue[rear] = value;
		}
	}
	
	//ť���� ������ ����
	public int delQueue() {
		if(isEmpty()) {
			System.out.println("ť�� ������ϴ�.");
			return 0;
		}
		else {
			front = (front + 1) % MAX;
			return queue[front];
		}		
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue(3);
		queue.addQueue(10);
		queue.addQueue(20);
		queue.addQueue(30);
		
		System.out.println(queue.delQueue());
		System.out.println(queue.delQueue());
		System.out.println(queue.delQueue());
		System.out.println(queue.delQueue());
	}
}
