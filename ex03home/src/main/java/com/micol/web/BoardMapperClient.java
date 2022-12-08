package com.micol.web;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.micol.web.board.BoardMapper;
import com.micol.web.board.BoardVO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class BoardMapperClient {
	@Autowired BoardMapper mapper;
	//@Test
	public void getBoard() {
		BoardVO vo = mapper.getBoard("1");
		System.out.println(vo);;
	}
	//@Test
	public void insertBoard() {
		BoardVO vo = new BoardVO();
		vo.setTitle("Title");
		vo.setContent("Content");
		vo.setWriter("Writer");
		int result = mapper.insertBoard(vo);
		System.out.println(result + "°Ç ÀÔ·ÂµÊ.");
	}
	//@Test
	public void updateBoard() {
		BoardVO vo = new BoardVO();
		vo.setBno("1");
		vo.setTitle("Title");
		vo.setContent("Content2");
		int result = mapper.updateBoard(vo);
		System.out.println(result + "°Ç ¾÷µ¥ÀÌÆ®µÊ.");
	}
	//@Test
	public void deleteBoard() {
		BoardVO vo = new BoardVO();
		vo.setBno("1");
		int result = mapper.deleteBoard(vo);
		System.out.println(result + "°Ç »èÁ¦µÊ.");
	}
	//@Test
	public void getBoardAll() {
		BoardVO vo = new BoardVO();
		vo.setTitle("c");
		mapper.getBoardAll(vo).forEach(board -> System.out.println(vo));
	}
	@Test
	public void count() {
		BoardVO vo = new BoardVO();
		vo.setTitle("t");
		System.out.println(mapper.count(vo));
	}
}
