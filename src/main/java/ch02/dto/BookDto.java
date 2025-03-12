package ch02.dto;

public class BookDto {
    private int bookId;
    private String bookName;
    private String publisher;
    private int price;

    public BookDto() {}
    public BookDto(int bookid, String bookname, String publisher, int price) {
        super();
        this.bookId = bookid;
        this.bookName = bookname;
        this.publisher = publisher;
        this.price = price;

    }
    public int getBookid() {
        return bookId;
    }
    public void setBookid(int bookid) {
        this.bookId = bookid;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
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
        return bookId + " " + bookName + " " + publisher + " " + price + " ";
    }
}
