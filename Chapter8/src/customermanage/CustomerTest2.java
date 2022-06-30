package customermanage;

public class CustomerTest2{

	public static void main(String[] args) {
		//°í°´ °´Ã¼ »ý¼º
		Customer customerLee = new Customer(10010, "ÀÌ¼ø½Å");
		VIPCustomer customerKing = new VIPCustomer(10020, "¼¼Á¾´ë¿Õ", 1446);
		
		int price = 10000;
		customerLee.calcPrice(price);
		customerKing.calcPrice(price);
		
		System.out.println(customerLee.showCustomerInfo());
		System.out.println(customerKing.showCustomerInfo());
	}
}
