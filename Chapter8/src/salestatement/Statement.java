package salestatement;

public class Statement {

	public static void main(String[] args) {
		Drink coffee = new Drink("Ŀ��", 2500, 10);
		Alcohol soju = new Alcohol("����", 4000, 5, 15.2f);
		
		Drink.printTitle();
		coffee.printData();
		
		Alcohol.printTitle();
		soju.printData();
		
		int sum = coffee.getTotalPrice() + soju.getTotalPrice();
		System.out.println("\n*** �հ� �ݾ� : " + sum + "�� ***");
		
	}

}
