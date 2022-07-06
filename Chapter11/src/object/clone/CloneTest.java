package object.clone;

public class CloneTest {

	public static void main(String[] args) {
		
		int[] arr1 = new int[] {10, 20, 30, 40};
		int[] arr2 = new int[4];
		int i;
		
		//System.out.println("일반 배열 복사");
		arr2 = arr1.clone();
		
		for(int a : arr2)
			System.out.println(a + " ");
		
		
	}

}
