package customermanage;

public class CustomerTest {

	public static void main(String[] args) {
		//�⺻�����ڷ� �����ϱ�
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("�̼���");
		
		//��ǰ ����
		int price = 10000;
		customerLee.calcPrice(price);  //100
		
		int price2 = 10000;
		customerLee.calcPrice(price2);  //100
		
		System.out.println(customerLee.showCustomerInfo());
	}
}
