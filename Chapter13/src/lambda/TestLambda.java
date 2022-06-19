package lambda;

interface PrintString{
	void showString(String str);
}

public class TestLambda {

	public static void main(String[] args) {
		//���ٽ��� �������̽��� ������ ����
		PrintString lambdaStr = s -> System.out.println(s);  
		lambdaStr.showString("hello lambda_1");
		
		showMyString(lambdaStr);  //�Ű������� ���ٽ��� ������ ���� ����
		
		PrintString reStr = returnString();  //������ ��ȯ�ޱ�
		reStr.showString("hello ");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("hello lambda_2");
	}
	
	public static PrintString returnString() {  //���ٽ��� ��ȯ�ϴ� �޼���
		return s -> System.out.println(s + "world");
	}

}
