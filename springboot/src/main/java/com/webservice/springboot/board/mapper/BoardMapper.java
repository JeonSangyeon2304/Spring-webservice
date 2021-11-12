package com.webservice.springboot.board.mapper;

import org.springframework.stereotype.Repository;

@Repository("com.webservice.springboot.board.mapper.BoardMapper")
public interface BoardMapper {
    
    public int boardCount() throws Exception;
}
