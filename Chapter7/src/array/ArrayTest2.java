package array;

public class ArrayTest2 {

	public static void main(String[] args) {
		String[] str1 = new String[3];
		str1[0] = "Java";
		str1[1] = "C++";
		str1[2] = "Python";
		System.out.printf("str1 �迭�� ������ %d���Դϴ�.\n", str1.length);
		
		String[] str2 = {"�ڹ�", "Python", "C++", "�ڹٽ�ũ��Ʈ"};
		System.out.printf("str2 �迭�� ������ %d���Դϴ�.\n", str2.length);
		
		System.out.println(str1[0]);
		System.out.println(str1[1]);
		System.out.println(str1[2]);
		
		System.out.println();
		
		for(int i=0; i<str2.length; i++) {
			System.out.println(str2[i]);
		}
		
		String[] str3 = str2.clone();
		for(int i=0; i<str3.length; i++) {
			System.out.println(str3[i]);
		}
	}
}
