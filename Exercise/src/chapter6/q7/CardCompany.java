package chapter6.q7;

import chapter6.q6.Card;

public class CardCompany {
	private static CardCompany instance;
	
	private CardCompany() {}
	
	public static CardCompany getInstance() {  //�ܺο��� �����Ҽ� �ֵ��� get() ����
		if(instance == null)
			instance = new CardCompany();
		return instance;
	}
	
	public Card createCard() {
		Card card = new Card();
		return card;
	}
}
