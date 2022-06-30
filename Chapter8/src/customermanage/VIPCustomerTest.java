package customermanage;

public class VIPCustomerTest {

	public static void main(String[] args) {
		
		VIPCustomer customerKing = new VIPCustomer();
		
		customerKing.setCustomerName("세종대왕");
		customerKing.agentID = 1446;
		
		//상품 구매
		int price = 10000;
		customerKing.calcPrice(price);  //450
	    
	    int price2 = 10000;
	    customerKing.calcPrice(price2); //450
		
		System.out.println(customerKing.showCustomerInfo());
	}
}
