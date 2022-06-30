package customermanage;

public class Customer {
	//�ʵ�
	private int customerID;           //�� ���̵�
	private String customerName;      //�� �̸�
	protected String customerGrade;   //�� ���
	int bonusPoint;					  //���ʽ� ����Ʈ
	double bonusRatio;                //���ʽ� ������
	
	public Customer() {
		customerGrade = "SILVER";  
		bonusRatio = 0.01;         //1%
	}
	
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customerGrade = "SILVER";  
		bonusRatio = 0.01; 
	}

	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public int calcPrice(int price) {
		//���ʽ� ����Ʈ = ���� x ���ʽ� ������
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " ���� ����� " + customerGrade + "�̸�, ���ʽ� ����Ʈ�� "
				+ bonusPoint + "�� �Դϴ�.";
	}
}
