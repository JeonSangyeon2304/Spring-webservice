package com.webservice.springboot.board.domain;

import java.util.Date;

public class CommentVO {
    private int cno;
    private int bno;
    private String content;
    private String writer;
    private Date reg_date;

    public int getCno() {
        return this.cno;
    }

    public void setCno(int cno) {
        this.cno = cno;
    }

    public int getBno() {
        return this.bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWriter() {
        return this.writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public Date getReg_date() {
        return this.reg_date;
    }

    public void setReg_date(Date reg_date) {
        this.reg_date = reg_date;
    }

}