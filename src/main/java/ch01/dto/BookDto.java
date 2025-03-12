package ch01.dto;

public class BookDto {
    private int bookid;
    private String bookname;
    private String publisher;
    private int price;

    public BookDto() {}
    public BookDto(int bookid, String bookname, String publisher, int price) {
        super();
        this.bookid = bookid;
        this.bookname = bookname;
        this.publisher = publisher;
        this.price = price;

    }
    public int getBookid() {
        return bookid;
    }
    public void setBookid(int bookid) {
        this.bookid = bookid;
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }
    public String getPublisher() {
        return publisher;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return bookid + " " + bookname + " " + publisher + " " + price + " ";
    }
}
