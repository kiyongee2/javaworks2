package array;

public class ArrayTest3 {

	public static void main(String[] args) {
		double[] data = new double[5];
		double total = 0.0;   //����
		double times = 0.0;   //���Ѱ�
		
		//����
		data[0] = 10.0;
		data[1] = 20.0;
		data[2] = 30.0;
		
		//���� �� ��ȸ
		for(int i=0; i<data.length; i++) {
			total += data[i];
			times *= data[i];
			System.out.println(data[i]);
		}
		System.out.println();
		System.out.println("���� : " +  total);
		System.out.println("�� : " + times);
	}
}
