package wrapper;

public class WrapperTest2 {

	public static void main(String[] args) {
		Integer iValue= new Integer(100);
		int myValue = iValue.intValue();   
		//��ڽ�(��ü���� �⺻������ ������ ��)
		System.out.println(myValue);
		
		//valueOf() ���� �޼���� ������ ���ڿ��� Integer�� ��ȯ
		Integer number1 = Integer.valueOf("200"); 
		Integer number2 = Integer.valueOf(200);
		System.out.println("number1 :"+number1+", "+"number2 :"+number2);
		
		//parseInt() ���� �޼���� ���ڿ����� int���� �����ͼ� ��ȯ
		int num = Integer.parseInt("1000"); 
		System.out.println(num);

	}

}
