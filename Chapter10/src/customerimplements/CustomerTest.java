package customerimplements;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		Buy buyer = customer;  //�ڵ� ����ȯ
		buyer.buy();
		
		Sell seller = customer;
		seller.sell();
	}
}
