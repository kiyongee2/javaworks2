package staticexample;

public class Student {
	static int serialNum = 1000; //���ذ�
	int id;
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
}
