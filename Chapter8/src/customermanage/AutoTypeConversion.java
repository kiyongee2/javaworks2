package customermanage;

public class AutoTypeConversion {
	public static void main(String[] args) {
//		Customer vc = new VIPCustomer(10020, "��׷�", 2000);
//		vc.bonusPoint = 1000;
//		System.out.println(vc.showCustomerInfo());
//		System.out.println(vc.getCustomerName()+"���� �����ؾ��ϴ� �ݾ��� "+vc.calcPrice(10000)+"���Դϴ�.");
//		
//		Customer gc = new GoldCustomer(10030,"Ȳ����");
//		gc.bonusPoint = 2000;
//		System.out.println(gc.showCustomerInfo());
//		System.out.println(gc.getCustomerName()+"���� �����ؾ��ϴ� �ݾ��� "+gc.calcPrice(20000) + "���Դϴ�.");
		
		Customer vc = new VIPCustomer(10000, "�߽ż�", 77);
		vc.bonusPoint = 1000;
		System.out.println(vc.showCustomerInfo());
		
		int price = 10000;
		System.out.println(vc.getCustomerName() + "���� �����ؾ� �ϴ� �ݾ��� " + vc.calcPrice(price) + "�� �Դϴ�.");
		System.out.println(vc.getCustomerName() + "���� ���ʽ� ����Ʈ�� " + vc.bonusPoint + "�� �Դϴ�.");
	}
}
