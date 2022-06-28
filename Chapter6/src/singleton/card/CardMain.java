package singleton.card;

public class CardMain {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();
		Card card1 = company.createCard();
		System.out.println(card1.getCardNumber());
		
		Card card2 = company.createCard();
		System.out.println(card2.getCardNumber());
	}

}
