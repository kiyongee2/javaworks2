package singleton;

public class Company {
	private static Company instance;
	
	private Company() {} //�ܺο��� �����ڸ� ȣ���� �� ����.
	
	//�ν��Ͻ��� �������� �ʰ�  Ŭ������ �����ϱ� ���� static �޼���� ����
	public static Company getInstance() { 
		if(instance == null) {
			instance = new Company();
		}
		return instance;
	}
}
