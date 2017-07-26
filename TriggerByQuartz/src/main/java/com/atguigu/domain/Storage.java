package com.atguigu.domain;

import java.util.Date;

public class Storage {
    private Integer id;

    private Integer bookid;

    private String status;

    private Date markdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBookid() {
        return bookid;
    }

    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    public Date getMarkdate() {
        return markdate;
    }

    public void setMarkdate(Date markdate) {
        this.markdate = markdate;
    }
}