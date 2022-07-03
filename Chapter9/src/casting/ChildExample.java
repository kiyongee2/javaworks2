package casting;

public class ChildExample {

	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/*parent.field2 = "data2";
		parent.method3();*/
		
		//1. 변환1 - 자식 필드와 메서드 사용 가능
		Child child = (Child)parent;  //자식형으로 강제 타입 변환
		child.field2 = "yyy";
		child.method3();
		
		//2. 변환2 - instanceof 연산자로 부모가 자식 객체인지 확인
		if(parent instanceof Child) {
			Child child2 = (Child)parent;
			child2.method3();
		}
	}
}
