package vehiclecasting;

public class VehicleTest {

	public static void main(String[] args) {
		//���� Ÿ�� ��ȯ�� ���� ��ü�� 
		//�������̽� Ÿ������ ��ȯ�Ǿ� �ִ� ���¿��� ����
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//checkFare()�� ������ ����
		
		//��ü Ÿ�� ��ȯ
		Bus bus = (Bus)vehicle;
		
		bus.run();
		bus.checkFare();
	}
}
