package tire;

public class Tire {
	//�ʵ�
	public int maxRotation;         //�ִ� ȸ����
	public int accmulatedRotation;  //���� ȸ����
	public String location;         //Ÿ�̾� ��ġ
	
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//�޼���
	public boolean roll() {
		++accmulatedRotation;  //���� ȸ���� 1����
		if(accmulatedRotation < maxRotation ) { //���� < �ִ�
			System.out.println(location + " Tire ����: " + 
					(maxRotation-accmulatedRotation) + "ȸ" );  //���� ȸ��
			return true;
		}else { //���� >= �ִ�
			System.out.println("*** " + location + " Tire ��ũ ***" );
			return false;
		}
	}
}
