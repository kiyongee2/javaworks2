package exception.throwssample;

public class ThrowsException {
	
	public static void main(String[] args) {
		try {
			//호출하는 쪽에서 try ~ catch 처리
			findClass();  
		} catch (ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class cls = Class.forName("java.lang.String2");
	}
}
