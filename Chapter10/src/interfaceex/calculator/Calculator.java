package interfaceex.calculator;

public interface Calculator {
	
	int ERROR = -9999;  //컴파일 과정에서 상수로 변함
	
	int add(int n1, int n2);
	int subtract(int n1, int n2);
	int times(int n1, int n2);
	int divide(int n1, int n2);
}
