package genericex.product;

public class Product<T> {
	private T Kind;   //��ǰ�� ����
	
	public T getKind() {
		return Kind;
	}
	public void setKind(T kind) {
		this.Kind = kind;
	}
}
