package customermanage;

public class TypeConversion2 {

	public static void main(String[] args) {
		Customer customerLee = new Customer(10010, "�̼���");
		customerLee.bonusPoint = 1000;
		System.out.println(customerLee.showCustomerInfo());
		
		Customer customerSon = new VIPCustomer(10030, "�����", 12346);
		customerSon.bonusPoint = 5000;
		System.out.println(customerSon.showCustomerInfo());
		
		int price = 10000;  //��ǰ ����
		
		System.out.println("===========�������� ���ʽ� ����Ʈ ��� ===========");
		System.out.println(customerLee.getCustomerName() + "���� " + customerLee.calcPrice(price)
        +"�� �����Ͽ���, ���ʽ� ����Ʈ�� " + customerLee.bonusPoint + "�Դϴ�.");
		
		System.out.println(customerSon.getCustomerName() + "���� " + customerSon.calcPrice(price)
        +"�� �����Ͽ���, ���ʽ� ����Ʈ�� " + customerSon.bonusPoint + "�Դϴ�.");
	}
}
