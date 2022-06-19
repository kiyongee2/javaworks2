package dbconnection.product;

import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		ProductVO prod1 = new ProductVO();
		//ProductVO prod2 = new ProductVO("x20200002", "����Ʈ TV", "Black", 200);
		ProductDAO dao = new ProductDAO();
		
		dao.addProduct(prod1);
		
		ArrayList<ProductVO> list = dao.listAll();
		
		for(int i=0; i<list.size(); i++) {
			ProductVO prodData = list.get(i);
			String prodCode = prodData.getProdCode();
			String prodName = prodData.getProdName();
			String prodColor = prodData.getProdColor();
			int prodQty = prodData.getProdQty();
			
			System.out.print("��ǰ��ȣ : " + prodCode);
			System.out.print(", ��ǰ�� : " + prodName);
			System.out.print(", ���� : " + prodColor);
			System.out.println(", ���� : " + prodQty);
		}
	}
}
