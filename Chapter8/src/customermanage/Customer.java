package customermanage;

public class Customer {
	//필드
	private int customerID;           //고객 아이디
	private String customerName;      //고객 이름
	protected String customerGrade;   //고객 등급
	int bonusPoint;					  //보너스 포인트
	double bonusRatio;                //보너스 적립율
	
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
		//보너스 포인트 = 가격 x 보너스 적립율
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customerGrade + "이며, 보너스 포인트는 "
				+ bonusPoint + "점 입니다.";
	}
}
