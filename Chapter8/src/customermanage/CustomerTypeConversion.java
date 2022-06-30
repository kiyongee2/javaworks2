package customermanage;

public class CustomerTypeConversion {

	public static void main(String[] args) {
		
		//자신 클래스로 객체 생성
		Customer customerLee = new Customer(10010, "이순신");

		//부모 클래스로 객체 생성(자동 형변환)
		//VIPCustomer customerKing = new VIPCustomer(10030, "세종대왕", 1446);
		Customer customerKing = new VIPCustomer(10030, "세종대왕", 1446);
		
		int price = 10000;  //상품 구매
		int leePrice = customerLee.calcPrice(price);
		int kingPrice = customerKing.calcPrice(price);
		
		System.out.println("=========== 할인율과 보너스 포인트 계산 ===========");
		System.out.println(customerLee.getCustomerName() + "님이 지불해야 하는 금액은 " + 
							leePrice + "원 입니다");
		System.out.println(customerKing.getCustomerName() + "님이 " + kingPrice +"원 입니다.");
	}
}
