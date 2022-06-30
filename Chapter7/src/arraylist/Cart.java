package arraylist;

import java.util.ArrayList;

public class Cart {
	public static void main(String[] args) {
		//ArrayList의 객체 생성
		ArrayList<String> cart = new ArrayList<>();
		
		//요소 저장
		cart.add("커피");
		cart.add("계란");
		cart.add("생수");
		
		//요소의 개수
		System.out.println("장바구니 품목: " + cart.size() + "개");
		
		//전체 출력
		for(int i=0; i<cart.size(); i++) {
		   String c =	cart.get(i);
		   System.out.println(c);
		}
		System.out.println();
		
		//자료 수정 - 커피를 라면으로 수정
		cart.set(0, "라면");
		
		//자료 삭제 - 생수
		cart.remove(1);
	
		//향상 for문 조회
		for(String c : cart)
			System.out.println(c);
	}
}
