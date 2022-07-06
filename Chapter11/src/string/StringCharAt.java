package string;

public class StringCharAt {

	public static void main(String[] args) {
		
		String subject = "자바 프로그래밍";
		char charValue = subject.charAt(0);
		System.out.println(charValue);
		
		//주민등록번호에서 남자와 여자를 구분하는 방법
		String ssn = "950815-1234567";
		char gender = ssn.charAt(7);
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자입니다");
			break;
		}
	}
}
