package scanners;

import java.util.Scanner;

public class KmToMile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		final double RATE_KPH_MPH = 1.609344;  //��ȯ ���
		double kph = 0.0;       //km/h
		double mph = 0.0;  //mile/h
		
		System.out.print("����� ������ �Է��ϼ���(km/h) : ");
		kph = scan.nextDouble();
		
		//mile = km / ��ȯ ���
		mph = kph / RATE_KPH_MPH;
		
		//printf("���ڿ� ����", ��ü)
		System.out.printf("���� �ӵ��� %.2f[MPH]�Դϴ�.", mph);
		scan.close();
	}
}
