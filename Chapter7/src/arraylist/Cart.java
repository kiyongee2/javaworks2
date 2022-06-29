package arraylist;

import java.util.ArrayList;

public class Cart {
	public static void main(String[] args) {
		ArrayList<String> cart = new ArrayList<>();
		
		cart.add("커피");
		cart.add("계란");
		cart.add("생수");
		
		System.out.println("장바구니 : " + cart.size() + "개");
		
		for(int i=0; i<cart.size(); i++) {
		   String c =	cart.get(i);
		   System.out.println(c);
		}
		
		//커피 삭제
		cart.remove(0);
		
		for(String c : cart)
			System.out.println(c);
	}
}
