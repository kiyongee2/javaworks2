
public class CMmanager2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(1001, "������");
		customerLee.bonusPoint = 1000;
		int price= 10000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKing = new VIPCustomer(1002, "�������", 1446);
		customerKing.bonusPoint = 5000;
		System.out.println(customerKing.showCustomerInfo());
		
		System.out.println("=====================�������� ���ʽ� ����Ʈ ��� ========================");
		System.out.println(customerLee.getCustomerName() + "���� " + customerLee.calcPrice(price) + "�����ϼ̽��ϴ�.");
		System.out.println(customerKing.getCustomerName() + "���� " + customerKing.calcPrice(price) + "�����ϼ̽��ϴ�.");
	}

}
