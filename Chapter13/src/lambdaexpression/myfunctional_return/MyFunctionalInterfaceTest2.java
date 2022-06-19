package lambdaexpression.myfunctional_return;

public class MyFunctionalInterfaceTest2 {

	public static void main(String[] args) {
		MyFunctionalInterface2 fi;
		
		fi = (x, y) -> {
			int result = x + y;
			return result;
		};
		System.out.println(fi.method(2, 5));

		fi = (x, y) ->  x + y;  //�߰�ȣ�� return ����
		System.out.println(fi.method(2, 5));
		
		fi = (x, y) -> sum(x, y);
		System.out.println(fi.method(2, 5));
	}
	
	public static int sum(int x, int y) {
		return (x + y);
	}
}
