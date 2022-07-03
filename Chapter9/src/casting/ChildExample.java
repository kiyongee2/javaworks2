package casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*parent.field2 = "data2";
		parent.method3();*/
		
		//1. ��ȯ1 - �ڽ� �ʵ�� �޼��� ��� ����
		Child child = (Child)parent;  //�ڽ������� ���� Ÿ�� ��ȯ
		child.field2 = "yyy";
		child.method3();
		
		//2. ��ȯ2 - instanceof �����ڷ� �θ� �ڽ� ��ü���� Ȯ��
		if(parent instanceof Child) {
			Child child2 = (Child)parent;
			child2.method3();
		}
	}
}
