package scanners;

import java.util.Scanner;

public class BallSpeed {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final Double RATE_KPH_MPH = 1.609344; //��ȯ ���
		Double kph = 0.0;
		Double mph = 0.0;
		
		System.out.print("����� ������ �Է��ϼ���(km/h) : ");
		kph = scan.nextDouble();
		
		mph = kph / RATE_KPH_MPH;
		
		System.out.printf("���� �ӵ��� %.2f[MPH]�Դϴ�.", mph);
		scan.close();
	}
}
