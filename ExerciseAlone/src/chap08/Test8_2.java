package chap08;

public class Test8_2 {

	public static void main(String[] args) {
		// 1. O, X, O, O
		
		//2. O, O, X, O
		
		//3.
		dbWork(new OracleDao());

	}
	
	public static void dbWork(DataAccessObject dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

}
