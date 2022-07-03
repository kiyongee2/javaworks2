package salestatement;

public class Alcohol extends Drink{
	
	float alcper;  //���� ����

	Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count); //Drink �ʵ� ���
		this.alcper = alcper;
	}
	
	//static�� ��� @Override�� ���� �� ����
	static void printTitle() {
		System.out.println("��ǰ��(����[%])\t����\t����\t�ݾ�");
	}
	
	@Override
	void printData() {  //Drink �ʵ忡 ���� ���� - protected �̹Ƿ�..
		System.out.println(name + "(" + alcper + ")\t" + price + "\t" + count + 
				"\t" + getTotalPrice());
	}
}
