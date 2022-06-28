package staticexample;

public class Student {
	static int serialNum = 1000; //±âÁØ°ª
	int id;
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
