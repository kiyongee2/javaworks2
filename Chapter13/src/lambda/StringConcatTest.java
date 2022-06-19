package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		System.out.println("***�Ϲ� ���� Ŭ����***");
		StringConcatImpl sImpl = new StringConcatImpl();
		sImpl.makeString("hello", "java");
		
		System.out.println("***���ٽ����� �����ϱ�***");
		StringConcat concat1 = (s1, s2) -> System.out.println(s1 + " " + s2);
		concat1.makeString("hello", "java");
		
		System.out.println("***�͸� ���� ��ü�� ���***");
//		StringConcat concat2 = new StringConcat() {
//			@Override
//			public void makeString(String s1, String s2) {
//				System.out.println(s1 + " " + s2);
//			}
//		};
//		concat2.makeString("hello", "java");
		
		StringConcat concat2 = new StringConcat() {

			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + ", " + s2);
			}
		};
		concat2.makeString("hello", "java");
	}
}
