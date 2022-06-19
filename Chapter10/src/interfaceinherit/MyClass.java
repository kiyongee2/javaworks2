package interfaceinherit;

public class MyClass implements MyInterface{
	@Override
	public void x() {
		System.out.println("x()");	
	}

	@Override
	public void y() {
		System.out.println("y()");
	}

	@Override
	public void myMethod() {
		System.out.println("myMethod()");
	}
	
	public static void main(String[] args) {
		MyClass myClass = new MyClass();
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		MyInterface iClass = myClass; //���� ���ε��� �ν��Ͻ��� myClass�� �޼��尡 �Ҹ�.
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
