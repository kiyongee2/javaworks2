package customermanage;

public class CustomerTest1 {

	public static void main(String[] args) {
		//�⺻�����ڷ� �����ϱ�
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerSon = new VIPCustomer();
		customerSon.setCustomerID(10020);
		customerSon.setCustomerName("�����");
		customerSon.bonusPoint = 5000;
		customerSon.agentID = 77;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerSon.showCustomerInfo());
	}

}
