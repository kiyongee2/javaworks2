package salestatement;

public class Alcohol extends Drink{
	
	float alcper;  

	Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper = alcper;
	}
	
	static void printTitle() {
		System.out.println("��ǰ��(����[%])\t����\t����\t�ݾ�");
	}
	
	@Override
	void printData() {
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + count + 
				"\t" + getTotalPrice());
	}

}
