package com.yxvk.hello.spring.boot.mybatis.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

public class Borrow {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "bookId")
    private Integer bookid;

    @Column(name = "borrowDate")
    private Date borrowdate;

    @Column(name = "repayDate")
    private Date repaydate;

    @Column(name = "userId")
    private Integer userid;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return bookId
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * @param bookid
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * @return borrowDate
     */
    public Date getBorrowdate() {
        return borrowdate;
    }

    /**
     * @param borrowdate
     */
    public void setBorrowdate(Date borrowdate) {
        this.borrowdate = borrowdate;
    }

    /**
     * @return repayDate
     */
    public Date getRepaydate() {
        return repaydate;
    }

    /**
     * @param repaydate
     */
    public void setRepaydate(Date repaydate) {
        this.repaydate = repaydate;
    }

    /**
     * @return userId
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }
}