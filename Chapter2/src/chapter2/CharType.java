package chapter2;

public class CharType {
	public static void main(String[] args) {
		//���� �ڷ���
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		char ch2 = 66;
		System.out.println(ch2);
		
		int ch3 = 67;
		System.out.println(ch3);
		System.out.println((char)ch3);
		
		System.out.println("\n***** �����ڵ� *****");
		
		char uniCode1 = '��';
		System.out.println(uniCode1);
		
		char uniCode2 = '\uD55C';
		System.out.println(uniCode2);
		
		for(char c = 97; c < 123; c++) {   //���� �ҹ��� ���(�ƽ�Ű�ڵ�)
			System.out.print(c + " ");
		} 
	}
}
