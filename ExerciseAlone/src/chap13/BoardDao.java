package chap13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList(){
		List<Board> boardList = new ArrayList<>();
		
		boardList.add(new Board("����1", "����1"));
		boardList.add(new Board("����2", "����2"));
		boardList.add(new Board("����3", "����3"));
		
		return boardList;
		
	}
}
