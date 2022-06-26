package array;

public class ArrayAlphabet {

	public static void main(String[] args) {
		char[] alphabets = new char[26];
		char ch = 'A';
		int i;
		
		alphabets[0]  = ch;
		System.out.println(alphabets[0]);
		System.out.println((int)alphabets[0]); //65
		//코드값 + 1
		alphabets[1] = (char) (ch+1);
		System.out.println(alphabets[1]);
		System.out.println((int)alphabets[1]); //65
		
		//배열에 알파벳 저장
		for(i=0; i<alphabets.length; i++) {
			alphabets[i] = ch;
			ch++;
		}
		
		//배열 출력
		for(i=0; i<alphabets.length; i++) {
			System.out.println(alphabets[i]+","+ (int)alphabets[i]);
		}
	}
}
