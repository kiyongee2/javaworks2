package string;

public class StringIndexOf {

	public static void main(String[] args) {
		
		String subject = "�ڹ� ���α׷���";
		
		int location = subject.indexOf("���α׷���");
		System.out.println(location);
		
		//���ڿ� �˻�
		if(subject.indexOf("�ڹ�") != -1) {
			System.out.println("�ڹٿ� ���õ� å�̱���!");
		}else {
			System.out.println("�ڹٿ� ������ ���� å�̱���!");
		}
	}
}
