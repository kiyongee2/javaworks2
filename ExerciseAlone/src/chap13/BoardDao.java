package chap13;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	public List<Board> getBoardList(){
		List<Board> boardList = new ArrayList<>();
		
		boardList.add(new Board("力格1", "郴侩1"));
		boardList.add(new Board("力格2", "郴侩2"));
		boardList.add(new Board("力格3", "郴侩3"));
		
		return boardList;
		
	}
}
