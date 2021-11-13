package com.webservice.springboot.board.domain;

public class FileVO {
    private int fno;
    private int bno;
    private String fileName;
    private String fileOriName;
    private String fileUrl;

    public int getFno() {
        return this.fno;
    }

    public void setFno(int fno) {
        this.fno = fno;
    }

    public int getBno() {
        return this.bno;
    }

    public void setBno(int bno) {
        this.bno = bno;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileOriName() {
        return this.fileOriName;
    }

    public void setFileOriName(String fileOriName) {
        this.fileOriName = fileOriName;
    }

    public String getFileUrl() {
        return this.fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

}
