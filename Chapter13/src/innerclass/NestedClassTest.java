package innerclass;

class A{
	A(){System.out.println("A ��ü�� ������");}
	
	// �ν��Ͻ� ��� Ŭ����
	class B{
		B(){System.out.println("B ��ü�� ������");}
		int field1;
		//static int field2;
		void method1() {}
		//static void method2();
	}
	
	//���� ��� Ŭ����
	static class C{
		C(){System.out.println("C ��ü�� ������");}
		int field1;
		static int field2;
		void method1() {}
		static void method2() {}
	}
	
	//local Ŭ���� - �żҵ� ������ ����� Ŭ����
	//static ��� �Ұ�
	void method() {
		class D{
			D(){System.out.println("D ��ü�� ������");}
			int field1;
			//static int field2;
			void method1() {}
			//static void method2() {}
		}
		D d = new D();
		d.field1 = 3;
		d.method1();
	}
}

public class NestedClassTest {
	public static void main(String[] args) {
		
		A a = new A();
		
		//�ν��Ͻ� ��� Ŭ���� ��ü ����
		A.B b = a.new B();
		b.field1 = 4;
		b.method1();
		
		//���� ��� Ŭ���� ��ü ����
		A.C c = new A.C();
		c.field1 = 5;
		c.method1();
		A.C.field2 = 6;
		A.C.method2();
		
		//���� Ŭ���� ��ü ������ ���� �޼ҵ� ȣ��
		a.method();
	}
}
