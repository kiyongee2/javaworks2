package salestatement;

public class Alcohol extends Drink{
	
	float alcper;  //알콜 도수

	Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count); //Drink 필드 상속
		this.alcper = alcper;
	}
	
	//static인 경우 @Override를 붙일 수 없음
	static void printTitle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	
	@Override
	void printData() {  //Drink 필드에 접근 가능 - protected 이므로..
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + count + 
				"\t" + getTotalPrice());
	}
}
