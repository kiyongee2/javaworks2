package chap07;

public class Test7_3 {

	public static void main(String[] args) {
		//1. O, O, O, X
		
		//2. O, O, O, X
		
		//3. 
		
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
