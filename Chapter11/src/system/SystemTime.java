package system;

public class SystemTime {

	public static void main(String[] args) {
		//���� �ð� ����
		long start = System.nanoTime();  //���� �ð� - ������
		//long start = System.currentTimeMillis(); //�и���
		
		int sum = 0;
		for(int i=1; i<=1000000; i++) {
			sum += i;
		}
		
		long end = System.nanoTime();  //���� �ð�
		
		System.out.println("1~1000000 ������ ��:" + sum);
		System.out.println("��꿡 " + (end-start) + " �����ʰ� �ҿ�Ǿ����ϴ�.");
	}
}
