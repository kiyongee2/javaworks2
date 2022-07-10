package genericex.box;

import java.util.ArrayList;

public class GenericTest {

	public static void main(String[] args) {
		
		ArrayList cart = new ArrayList<>();
		cart.add("grape");
		
		String str = (String) cart.get(0);
		System.out.println(str);
	}

}
