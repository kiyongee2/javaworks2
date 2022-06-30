package customermanage;

public class VIPCustomer extends Customer{
	//�ʵ�
	int agentID;          //���� ID
	double saleRatio;     //���� ������
	
	public VIPCustomer() {
		//super();
		customerGrade = "VIP";
		bonusRatio = 0.05;    //5%
		saleRatio = 0.1;      //10%
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);  //Customer �ʵ� ���
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		//���� = ���� - (���� x ����������)
		price -= (int)(price * saleRatio);
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
}
