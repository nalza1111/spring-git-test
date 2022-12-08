package com.micol.web.board;

import java.util.List;
import java.util.Map;

public interface BoardMapper {
	public BoardVO getBoard(String bno);//
	public int updateBoard(BoardVO vo);//
	public int insertBoard(BoardVO vo);//
	public int deleteBoard(BoardVO vo);//
	
	public List<Map<String, Object>> getBoardAll(BoardVO vo);
	public List<BoardVO> getBoardAllWriter(BoardVO vo);
	public int count(BoardVO vo);
}
