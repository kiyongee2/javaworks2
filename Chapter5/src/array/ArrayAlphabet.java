package array;

public class ArrayAlphabet {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		int i;
		
		alphabets[0]  = ch;
		System.out.println(alphabets[0]);
		System.out.println((int)alphabets[0]); //65
		//�ڵ尪 + 1
		alphabets[1] = (char) (ch+1);
		System.out.println(alphabets[1]);
		System.out.println((int)alphabets[1]); //65
		
		//�迭�� ���ĺ� ����
		for(i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//�迭 ���
		for(i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+","+ (int)alphabets[i]);
		}
	}
}
