package com.webservice.springboot.board.service;

import java.util.List;

import javax.annotation.Resource;
import org.springframework.stereotype.Service;
     
import com.webservice.springboot.board.domain.CommentVO;
import com.webservice.springboot.board.mapper.CommentMapper;
     
@Service("com.webservice.springboot.board.service.CommentService")
public class CommentService {
    @Resource(name="com.webservice.springboot.board.mapper.CommentMapper")
    CommentMapper mCommentMapper;
    
    public List<CommentVO> commentListService() throws Exception {
        return mCommentMapper.commentList();
    }

    public int commentInsertService(CommentVO comment) throws Exception {
        return mCommentMapper.commentInsert(comment);
    }
    
    public int commentUpdateService(CommentVO comment) throws Exception {
        return mCommentMapper.commentUpdate(comment);
    }
    
    public int commentDeleteService(int cno) throws Exception {
        return mCommentMapper.commentDelete(cno);
    }
}