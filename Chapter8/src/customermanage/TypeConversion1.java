package customermanage;

public class TypeConversion1 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "��׷�", 2000);  //VIP ������
		vc.bonusPoint = 1000;
		int price = 20000;  //��ǰ ����
		
		System.out.println(vc.getCustomerName() + "���� �����ؾ��ϴ� �ݾ��� "
				 + vc.calcPrice(price) + "���Դϴ�."); 
		System.out.println(vc.getCustomerName()+" ���� ���ʽ� ����Ʈ�� "
				+ vc.bonusPoint + "���Դϴ�.");
	}
}
