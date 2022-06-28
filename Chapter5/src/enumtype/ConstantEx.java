package enumtype;

public class ConstantEx {

	public static void main(String[] args) {
		//상수 사용하기
		//new를 사용하지 않고 클래스로 직접 접근함
		int maxV = UsingDefine.MAX_NUM;
		int minV = UsingDefine.MIN_NUM;
		
		System.out.println(maxV);
		System.out.println(minV);
	}
}
