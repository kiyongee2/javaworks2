package inheritance;

class People{
	String name;
	String rrn;  //�ֹε�Ϲ�ȣ(Resident Registration Number)
	
	public People(String name, String rrn) {
		this.name = name;
		this.rrn = rrn;
	}
}

class Banker extends People {
	int companyID;
	
	public Banker(String name, String rrn, int companyID) {
		super(name, rrn);
		this.companyID = companyID;
	}
}

public class BankerTest {

	public static void main(String[] args) {
		Banker BankerJang = new Banker("��׷�", "920815-1234567", 101);
		System.out.println("�̸� : " + BankerJang.name);
		System.out.println("�ֹε�Ϲ�ȣ : " + BankerJang.rrn);
		System.out.println("��� : " + BankerJang.companyID);
	}
}
