package customermanage;

public class CustomerTypeConversion {

	public static void main(String[] args) {
		
		//�ڽ� Ŭ������ ��ü ����
		Customer customerLee = new Customer(10010, "�̼���");

		//�θ� Ŭ������ ��ü ����(�ڵ� ����ȯ)
		//VIPCustomer customerKing = new VIPCustomer(10030, "�������", 1446);
		Customer customerKing = new VIPCustomer(10030, "�������", 1446);
		
		int price = 10000;  //��ǰ ����
		int leePrice = customerLee.calcPrice(price);
		int kingPrice = customerKing.calcPrice(price);
		
		System.out.println("=========== �������� ���ʽ� ����Ʈ ��� ===========");
		System.out.println(customerLee.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + 
							leePrice + "�� �Դϴ�");
		System.out.println(customerKing.getCustomerName() + "���� " + kingPrice +"�� �Դϴ�.");
	}
}
