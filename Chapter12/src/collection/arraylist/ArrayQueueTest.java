package collection.arraylist;

import java.util.ArrayList;

class MyQueue{
	private ArrayList<String> arrayQueue = new ArrayList<>();
	
	//ť�� �� �ڿ� �߰�
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	
	//ť�� �� �տ��� ����
	public String deQueue() {
		int len = arrayQueue.size();
		if(len==0) {
			System.out.println("ť�� ������ϴ�.");
			return null;
		}
		return arrayQueue.remove(0);
	}
}

public class ArrayQueueTest {
	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
		System.out.println(queue.deQueue());
	}
}
