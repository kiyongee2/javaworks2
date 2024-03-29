package singleton;

public class Company {
	//유일하게 생성한 인스턴스
	private static Company instance = new Company();
	
	private Company() {} //외부에서 생성자를 호출할 수 없다.
	
	//인스턴스를 생성하지 않고 클래스로 접근하기 위해 static 메서드로 만듦
	public static Company getInstance() { 
		return instance;
	}
}
