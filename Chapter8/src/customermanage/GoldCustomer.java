package customermanage;

public class GoldCustomer extends Customer{
	//�ʵ�
	double saleRatio;   //���� ������
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);  //Customer �ʵ� ���
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	public int calcPrice(int price) {
		price -= (int)(price*saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
}
