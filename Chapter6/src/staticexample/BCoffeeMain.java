package staticexample;

public class BCoffeeMain {

		public static void main(String[] args) {
			BCoffee coffee = new BCoffee();
			coffee.name = "���ٹ�";
			
			System.out.println(coffee.name + "�� �Ƹ޸�ī��� " + BCoffee.AMERICANO + "�� �Դϴ�.");
			System.out.println(coffee.name + "�� �󶼴� " + BCoffee.RATTE+ "�� �Դϴ�.");
			
		}
}
