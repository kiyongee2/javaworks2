package chap13;

import java.util.List;

public class Test13_1 {

	public static void main(String[] args) {
		
		//1. O, O, O, X
		
		//2. O, O, X, O
		
		//3. O, O, O, X
		
		//4. 4
		
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board board : list) {
			System.out.println(board.getTitle() + "-" + board.getContent());
		}
	}

}
