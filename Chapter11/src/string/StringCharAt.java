package string;

public class StringCharAt {

	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		char charValue = subject.charAt(0);
		System.out.println(charValue);
		
		//�ֹε�Ϲ�ȣ���� ���ڿ� ���ڸ� �����ϴ� ���
		String ssn = "950815-1234567";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("�����Դϴ�");
			break;
		case '2':
		case '4':
			System.out.println("�����Դϴ�");
			break;
		}
	}
}
