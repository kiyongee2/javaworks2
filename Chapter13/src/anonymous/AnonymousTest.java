package anonymous;

public class AnonymousTest {

	public static void main(String[] args) {
		
		Anonymous annoy = new Anonymous();
		annoy.field.wake();
		
		annoy.method1();
		
		annoy.method2(new Person(){
			void study() {
				System.out.println("�����մϴ�.");
			}
			
			@Override
			void wake() {
				System.out.println("8�ÿ� �Ͼ�ϴ�.");
				study();
			}
		});
	}
}
