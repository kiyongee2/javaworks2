package chapter2;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = '��';      
		char ch2 = '\uAE00';  //'��'�� �����ڵ� ��
		//http://www.unicode.org/charts/PDF/UAC00.pdf
		
		System.out.println(ch1);
		System.out.println(ch2);
		
		int a = 65;
		int b = -66;
		
		char a2 = 65;
		//char b2 = -66;   //char���� �������� ǥ���� �� ����.
		
		System.out.println((char)a);
		System.out.println((char)b);
		System.out.println(a2);
		
		for(char c=12593; c<12686; c++) {  //�ѱ� ��� (�����ڵ�)
			System.out.print(c + " ");
		}

	}

}
