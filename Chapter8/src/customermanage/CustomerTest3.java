package customermanage;

public class CustomerTest3 {

	public static void main(String[] args) {
		//�Ű������� �ִ� �����ڷ� �����ϱ�
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerSon = new VIPCustomer(10020, "�����", 100);
		customerSon.bonusPoint = 5000;
		System.out.println(customerSon.showCustomerInfo());
	}

}
