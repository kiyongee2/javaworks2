package salestatement;

public class Statement {

	public static void main(String[] args) {
		Drink coffee = new Drink("커피", 2500, 10);
		Alcohol soju = new Alcohol("소주", 4000, 5, 15.2f);
		
		Drink.printTitle();
		coffee.printData();
		
		Alcohol.printTitle();
		soju.printData();
		
		int sum = coffee.getTotalPrice() + soju.getTotalPrice();
		System.out.println("\n*** 합계 금액 : " + sum + "원 ***");
		
	}

}
