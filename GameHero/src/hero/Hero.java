package hero;

public class Hero {
	String job;
	
	public Hero(String job) {
		this.job = job;
	}
	
	public void attack() {
		System.out.println("�ָ� ������");
	}
	
	public void jobInfo() {
		System.out.println("���� : " + job);
	}
}
