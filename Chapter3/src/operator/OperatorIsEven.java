package operator;

public class OperatorIsEven {

	public static void main(String[] args) {
		// 11�� ¦���� ��� True, �ƴϸ� False ���
		int num = 11;
		boolean isEven;
		isEven = (num % 2) == 0 ? true : false;
		System.out.println(isEven);
		
		String str = (num % 2 ==  0) ? "¦��" : "Ȧ��";
		System.out.println(str);
	}

}
