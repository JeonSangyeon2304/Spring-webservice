package com.webservice.springboot.board.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.webservice.springboot.board.domain.BoardVO;
import com.webservice.springboot.board.domain.FileVO;

@Repository("com.webservice.springboot.board.mapper.BoardMapper")
public interface BoardMapper {
    // 게시글 수
    public int boardCount() throws Exception;

    // 게시글 목록
    public List<BoardVO> boardList() throws Exception;

    // 게시글 상세
    public BoardVO boardDetail(int bno) throws Exception;

    // 게시글 작성
    public int boardInsert(BoardVO board) throws Exception;

    // 게시글 수정
    public int boardUpdate(BoardVO board) throws Exception;

    // 게시글 삭제
    public int boardDelete(int bno) throws Exception;

    // 파일 업로드
    public int fileInsert(FileVO file) throws Exception;

    // 파일 다운로드
    public FileVO fileDetail(int bno) throws Exception;
}
