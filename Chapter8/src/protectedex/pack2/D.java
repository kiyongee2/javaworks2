package protectedex.pack2;

import protectedex.pack1.A;

public class D extends A{
	//상속은 자식 클래스에게 접근 허용
	public D() {
		super();
		this.field = "value";  
		this.method();
	}
}
