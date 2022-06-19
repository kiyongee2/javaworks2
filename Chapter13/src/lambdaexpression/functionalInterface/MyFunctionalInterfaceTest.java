package lambdaexpression.functionalInterface;

public class MyFunctionalInterfaceTest {

	public static void main(String[] args) {
		MyFunctionalInterface fi;
		
		fi = () -> {   //���๮�� 2��
			String str = "method call1";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call2");}; //���๮�� 1��
		fi.method();
		
		fi = () -> System.out.println("method call3");  //���๮�� 1�� (�߰�ȣ ����)
		fi.method();
		
		//MyFunctionalInterface.java�� �ʿ���� �ȴ�.
		fi = new MyFunctionalInterface() {
			public void method() {
				System.out.println("method call4");
			}
		};
		fi.method();
	}
}
