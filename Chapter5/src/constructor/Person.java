package constructor;

public class Person {
	String name;
	float height;
	float weight;
	
	public Person() { }
	
	public Person(String na) {
		name = na;
	}
	
	public Person(String na, float hei, float wei) {
		name = na;
		height = hei;
		weight = wei;
	}
	
	public void showInfo() {
		System.out.println("�̸� : "+name+", "+
	       "Ű : "+height+", "+"������ : "+weight);
	}
}
