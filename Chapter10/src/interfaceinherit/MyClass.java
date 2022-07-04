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
		//자동 타입 변환
		MyClass myClass = new MyClass();
		X x = myClass;
		x.x();
		
		Y y = myClass;
		y.y();
		
		//X와 Y를 상속한 iClass 객체 생성
		System.out.println("** 다중 상속한 iClass 출력 **");
		MyInterface iClass = myClass; 
		iClass.myMethod();
		iClass.x();
		iClass.y();
	}
}
