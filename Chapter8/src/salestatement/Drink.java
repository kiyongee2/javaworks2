package salestatement;

public class Drink {
	String name;  //��ǰ��
	int price;    //����
	int count;    //����
	
	Drink(String name, int price, int count){
		this.name = name;
		this.price = price;
		this.count = count;
	}
	
	int getTotalPrice() {
		//��� = ���� x ����
		return price * count;
	}
	
	static void printTitle() {  //���� ���
		System.out.println("��ǰ��\t����\t����\t�ݾ�");
	}
	
	void printData() {  //������ ���
		System.out.println(name + "\t" + price + "\t" + 
				count + "\t" + getTotalPrice());
	}
}
