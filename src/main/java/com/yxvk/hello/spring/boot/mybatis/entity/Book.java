package com.yxvk.hello.spring.boot.mybatis.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "library..book")
public class Book {
    /**
     * 主键
     */
    @Id
    @Column(name = "bookId")
    private Integer bookid;

    /**
     * 书名
     */
    @Column(name = "bookName")
    private String bookname;

    /**
     * 作者
     */
    private String author;

    /**
     * 出版社
     */
    private String press;

    /**
     * 上架时间
     */
    private Date date;

    /**
     * 销量
     */
    private Integer sales;

    /**
     * 价格
     */
    private Integer price;

    /**
     * 类型
     */
    private String type;

    /**
     * 详情
     */
    private String details;

    /**
     * 获取主键
     *
     * @return bookId - 主键
     */
    public Integer getBookid() {
        return bookid;
    }

    /**
     * 设置主键
     *
     * @param bookid 主键
     */
    public void setBookid(Integer bookid) {
        this.bookid = bookid;
    }

    /**
     * 获取书名
     *
     * @return bookName - 书名
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * 设置书名
     *
     * @param bookname 书名
     */
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    /**
     * 获取作者
     *
     * @return author - 作者
     */
    public String getAuthor() {
        return author;
    }

    /**
     * 设置作者
     *
     * @param author 作者
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * 获取出版社
     *
     * @return press - 出版社
     */
    public String getPress() {
        return press;
    }

    /**
     * 设置出版社
     *
     * @param press 出版社
     */
    public void setPress(String press) {
        this.press = press;
    }

    /**
     * 获取上架时间
     *
     * @return date - 上架时间
     */
    public Date getDate() {
        return date;
    }

    /**
     * 设置上架时间
     *
     * @param date 上架时间
     */
    public void setDate(Date date) {
        this.date = date;
    }

    /**
     * 获取销量
     *
     * @return sales - 销量
     */
    public Integer getSales() {
        return sales;
    }

    /**
     * 设置销量
     *
     * @param sales 销量
     */
    public void setSales(Integer sales) {
        this.sales = sales;
    }

    /**
     * 获取价格
     *
     * @return price - 价格
     */
    public Integer getPrice() {
        return price;
    }

    /**
     * 设置价格
     *
     * @param price 价格
     */
    public void setPrice(Integer price) {
        this.price = price;
    }

    /**
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 获取详情
     *
     * @return details - 详情
     */
    public String getDetails() {
        return details;
    }

    /**
     * 设置详情
     *
     * @param details 详情
     */
    public void setDetails(String details) {
        this.details = details;
    }
}