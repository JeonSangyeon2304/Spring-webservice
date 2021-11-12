package com.webservice.springboot.board.domain;

import java.util.Date;

public class BoardVO {
    private int bno;
    private String subject;
    private String content;
    private String writer;
    private Date reg_data;

    public int getBno() {
        return this.bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
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

    public Date getReg_data() {
        return this.reg_data;
    }

    public void setReg_data(Date reg_data) {
        this.reg_data = reg_data;
    }

}