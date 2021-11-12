package com.webservice.springboot;

import javax.annotation.Resource;

import com.webservice.springboot.board.mapper.BoardMapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspTest {
    @Resource(name="com.webservice.springboot.board.mapper.BoardMapper")
    BoardMapper mBoardMapper;

    @RequestMapping("/test")
    private String jspTest() throws Exception {
        System.out.println(mBoardMapper.boardCount());
        return "test";
    }
}
