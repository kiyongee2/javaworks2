package chapter6;

public class EatCoffee {

	public static void main(String[] args) {
		Person kim = new Person("����", 10000);
		Bdabang bstar = new Bdabang("bstar");
		kim.eatCoffee(bstar);
		kim.showInfo();
		bstar.showInfo();

	}

}
