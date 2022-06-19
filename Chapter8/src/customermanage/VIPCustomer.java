package customermanage;

public class VIPCustomer extends Customer{
	int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		//super();
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		this.agentID = agentID;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
	}
	
	public int getAgentID() {
		return agentID;
	}
	
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "��� ���� ���̵�� " + agentID + "�Դϴ�.";
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price-(int)(price*saleRatio);
	}
}
