package singleton;

public class Company {
	//�����ϰ� ������ �ν��Ͻ�
	private static Company instance = new Company();
	
	private Company() {} //�ܺο��� �����ڸ� ȣ���� �� ����.
	
	//�ν��Ͻ��� �������� �ʰ� Ŭ������ �����ϱ� ���� static �޼���� ����
	public static Company getInstance() { 
		return instance;
	}
}
