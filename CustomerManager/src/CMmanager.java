
public class CMmanager {

	public static void main(String[] args) {
		Customer customerLee = new Customer();
		customerLee.setCustomerID(10010);
		customerLee.setCustomerName("�̼���");
		customerLee.bonusPoint = 1000;
		int price = 10000;
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + "���� " + customerLee.calcPrice(price)
		              + "�� �����ϼ̽��ϴ�.");
		
		VIPCustomer customerHong = new VIPCustomer();
		customerHong.setCustomerID(10020);
		customerHong.setCustomerName("ȫ�浿");
		customerHong.bonusPoint = 5000;
		customerHong.setAgentID(55);
		
		System.out.println(customerHong.showCustomerInfo());
		System.out.println(customerLee.getCustomerName() + "���� " + customerHong.calcPrice(price)
		              + "�� �����ϼ̽��ϴ�.");
	}

}
