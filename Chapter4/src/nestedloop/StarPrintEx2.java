package nestedloop;

public class StarPrintEx2 {

	public static void main(String[] args) {
		// star 
		int i, j;
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j <= 5-i; j++) {
				System.out.print(" "); //���鹮��
			}
			for(j = 1; j <= i; j++) {
				System.out.print("*"); 
			}
			System.out.println();  //�� �ٲ�
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j < i; j++) {
				System.out.print(" "); //���鹮��
			}
			for(j = 1; j <= 6-i; j++) {
				System.out.print("*"); 
			}
			System.out.println();  //�� �ٲ�
		}
		
		for(i = 1; i <= 5; i++) {
			for(j = 1; j < i; j++) {
				System.out.print(" "); //���鹮��
			}
			for(j = 5; j >= i; j--) {
				System.out.print("*"); 
			}
			System.out.println();  //�� �ٲ�
		}
		
		//������ Ȱ���ϱ�
		int row = 5;
		int star = 1;
		int space = row-1;
		
		for(i = 1; i <= row; i++) {
			for(j = 1; j <= space; j++) {
				System.out.print(" "); //���鹮��
			}
			for(j = 1; j <= star; j++) {
				System.out.print("*");
			}
			if(i <= row) {
				space -= 1;
				star += 1;
			}
			System.out.println();
		}
	}
}
