package customermanage;

public class CustomerTest2{

	public static void main(String[] args) {
		//�� ��ü ����
		Customer customerLee = new Customer(10010, "�̼���");
		VIPCustomer customerKing = new VIPCustomer(10020, "�������", 1446);
		
		int price = 10000;
		customerLee.calcPrice(price);
		customerKing.calcPrice(price);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKing.showCustomerInfo());
	}
}
