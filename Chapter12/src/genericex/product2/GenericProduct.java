package genericex.product2;

public class GenericProduct {

	public static void main(String[] args) {
		//<Ŭ����, ���ڿ�> Ÿ��
		Product<TV, String> prod1 = new Product<>();
		TV tv = new TV();
		prod1.setKind(tv);
		prod1.setModel("����ƮTV");
		String tvModel = prod1.getModel();
		tv.making();
		System.out.println("��: " + tvModel);
		
		//<Ŭ����, ���ڿ�> Ÿ��
		Product<Car, String> prod2 = new Product<>();
		Car car = new Car();
		prod2.setKind(car);
		prod2.setModel("������");
		car.making();
		System.out.println("��: " + prod2.getModel());
	}
}
