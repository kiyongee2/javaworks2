package array2d;

public class TwoDimention1 {

	public static void main(String[] args) {
		//정수형 2차원 배열
		int[][] a = new int[2][3];
		int i, j;
		
		System.out.println(a.length);      //행의 크기
	    System.out.println(a[0].length);   //열의 크기
	    System.out.println(a[1].length);
	    
	    //배열의 초기값 출력
	    for(i=0; i<a.length; i++) {
	    	for(j=0; j<a[i].length; j++) {
	    		System.out.print(a[i][j] + " ");
	    	}
	    	System.out.println();
	    }
	    System.out.println("========================");
	    
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
