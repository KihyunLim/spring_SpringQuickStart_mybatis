package com.springbook.biz.board;

import java.sql.SQLException;
import java.util.List;

import com.springbook.biz.board.BoardVO;
import com.springbook.biz.board.impl.BoardDAO;

public class BoardServiceClient {

	public static void main(String[] args) throws SQLException {
		BoardDAO boardDAO = new BoardDAO();
		
		BoardVO vo = new BoardVO();
		vo.setTitle("myBatis 제목4");
		vo.setWriter("홍길동4");
		vo.setContent("myBatis 내용입니다...4");
		boardDAO.insertBoard(vo);
		
		vo.setSearchCondition("TITLE");
		vo.setSearchKeyword("");
		List<BoardVO> boardList = boardDAO.getBoardList(vo);
		for(BoardVO board : boardList) {
			System.out.println("---> " + board.toString());
		}
	}
}
