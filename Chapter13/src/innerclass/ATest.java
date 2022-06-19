package innerclass;

class A{
	A(){
		System.out.println("A ��ü�� ������");
	}
	
	// �ν��Ͻ� ��� Ŭ����
	class B{
		B(){
			System.out.println("B ��ü�� ������");
		}
	}
	
	//���� ��� Ŭ����
	static class C{
		C(){
			System.out.println("C ��ü�� ������");
		}
	}
	
	//local Ŭ����(method()�� ȣ���Ҷ��� ����)
	void method() {
		class D{
			D(){
				System.out.println("D ��ü�� ������");
			}
		}
		D d = new D();
	}
}

public class ATest {
	public static void main(String[] args) {
		A a = new A();
		
		A.B b = a.new B();
		
		A.C c = new A.C();
		
		a.method();
	}
}
