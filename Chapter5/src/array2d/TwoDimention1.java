package array2d;

public class TwoDimention1 {

	public static void main(String[] args) {
		//이차원 배열의 길이 출력하기
		int[][] a = new int[2][3];
		int i, j;
		
		System.out.println(a.length);
	    System.out.println(a[0].length);
	    System.out.println(a[1].length);
	    
	    for(i=0; i<a.length; i++) {
	    	for(j=0; j<a[i].length; j++) {
	    		System.out.print(a[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("============");
	    
	    //저장1
	    a[0][0] = 1;
	    a[0][1] = 2;
	    a[0][2] = 3;
	    a[1][0] = 4;
	    a[1][1] = 5;
	    a[1][2] = 6;
	    
	    //저장2
		/*int[][] a = {
				{1, 2, 3},
				{4, 5, 6}
		};*/
		for(i=0; i<a.length; i++) {
			for(j=0; j<a[i].length; j++) {
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}
}
