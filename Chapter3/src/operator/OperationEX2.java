package operator;

public class OperationEX2 {
	public static void main(String[] args) {
		//����, ���� ������
		int num = 10;
		int val = 0;
		
		//val = num++; //val = num ���� num = num + 1;
		val = ++num;   //num = num + 1 ���� val = num
		System.out.println(val); 
		System.out.println(num); 
		
		//val = num--;  //val = num ���� num = num - 1;
		val = --num;    //num = num - 1 ���� val = num
		System.out.println(val);
		System.out.println(num);
		
		//��� ������
		int mathScore = 90;
		int engScore = 75;
		
		int totalScore = mathScore + engScore;
		System.out.println(totalScore);
		
		double avgScore = (double)totalScore / 2;
		System.out.println(avgScore);
	}
}
