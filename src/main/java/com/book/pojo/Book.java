package com.book.pojo;

public class Book {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_isbn
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String bookIsbn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_name
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String bookName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_author
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String bookAuthor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_press
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String bookPress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_price
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private Double bookPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_detail
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private String bookDetail;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_info.book_status
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    private Integer bookStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_isbn
     *
     * @return the value of book_info.book_isbn
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getBookIsbn() {
        return bookIsbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_isbn
     *
     * @param bookIsbn the value for book_info.book_isbn
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn == null ? null : bookIsbn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_name
     *
     * @return the value of book_info.book_name
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_name
     *
     * @param bookName the value for book_info.book_name
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookName(String bookName) {
        this.bookName = bookName == null ? null : bookName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_author
     *
     * @return the value of book_info.book_author
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getBookAuthor() {
        return bookAuthor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_author
     *
     * @param bookAuthor the value for book_info.book_author
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_press
     *
     * @return the value of book_info.book_press
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getBookPress() {
        return bookPress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_press
     *
     * @param bookPress the value for book_info.book_press
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookPress(String bookPress) {
        this.bookPress = bookPress == null ? null : bookPress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_price
     *
     * @return the value of book_info.book_price
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public Double getBookPrice() {
        return bookPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_price
     *
     * @param bookPrice the value for book_info.book_price
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookPrice(Double bookPrice) {
        this.bookPrice = bookPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_detail
     *
     * @return the value of book_info.book_detail
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public String getBookDetail() {
        return bookDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_detail
     *
     * @param bookDetail the value for book_info.book_detail
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookDetail(String bookDetail) {
        this.bookDetail = bookDetail == null ? null : bookDetail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_info.book_status
     *
     * @return the value of book_info.book_status
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public Integer getBookStatus() {
        return bookStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_info.book_status
     *
     * @param bookStatus the value for book_info.book_status
     *
     * @mbg.generated Sat Mar 09 13:15:17 CST 2019
     */
    public void setBookStatus(Integer bookStatus) {
        this.bookStatus = bookStatus;
    }
}