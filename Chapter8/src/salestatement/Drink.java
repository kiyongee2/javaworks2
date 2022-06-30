package salestatement;

public class Drink {
	String name;  //상품명
	int price;    //가격
	int count;    //수량
	
	Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	int getTotalPrice() {
		//계산 = 가격 x 수량
		return price * count;
	}
	
	static void printTitle() {  //제목 출력
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	void printData() {  //데이터 출력
		System.out.println(name + "\t" + price + "\t" + 
				count + "\t" + getTotalPrice());
	}
}
