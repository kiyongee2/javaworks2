package customermanage;

public class CustomerTest {

	public static void main(String[] args) {
		//기본생성자로 생성하기
		Customer customerLee = new Customer();
		
		customerLee.setCustomerName("이순신");
		
		//상품 구매
		int price = 10000;
		customerLee.calcPrice(price);  //100
		
		int price2 = 10000;
		customerLee.calcPrice(price2);  //100
		
		System.out.println(customerLee.showCustomerInfo());
	}
}
