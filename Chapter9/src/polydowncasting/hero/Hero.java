package polydowncasting.hero;

public class Hero {
	String name;
	
	public Hero(String name) { this.name = name; }
	
	public void attack() {
		System.out.println("�⺻ : �ָ� ������");
	}
	
	public void showInfo() {
		System.out.println("���� : " + name);
	}
}
