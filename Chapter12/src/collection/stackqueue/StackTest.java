package collection.stackqueue;

class Stack{
	int[] stack;
	int size;
	int top;
	
	//���� �޸� ���� ����
	public Stack(int size) {
		this.size = size;
		stack = new int[size];
		top = -1;
	}
	
	//���ÿ� ������ ����
	public void Push(int n) {
		top++;
		stack[top] = n;
	}
	
	//���ÿ��� ������ ����
	public int Pop() {
		int n;
		if(top == -1) {
			System.out.println("������ ������ϴ�.");
			return 0;
		}	
		n = stack[top];
		top--;
		return n;
	}
		
}

public class StackTest {
	public static void main(String[] args) {
		Stack stack = new Stack(3);
		stack.Push(10);
		stack.Push(20);
		stack.Push(30);
		
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
		System.out.println(stack.Pop());
	}
}
