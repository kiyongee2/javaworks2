package exception.handling;

public class Exceptionhandling3 {

	public static void main(String[] args) {
		
		try {
			Class cls = Class.forName("java.lang.String2");
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
}
