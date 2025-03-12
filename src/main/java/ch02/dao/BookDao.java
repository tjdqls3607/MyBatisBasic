package ch02.dao;

import ch01.dto.BookDto;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

public interface BookDao {
    // 5가지 기능
    @Select("select  bookid bookId, bookname bookName, publisher, price from book;")
    List<BookDto> listBook();

    @Select("select  bookid bookId, bookname bookName, publisher, price from book where bookid = #{bookId};")
    BookDto detailBook(int bookId);

    @Insert("insert into book (bookid, bookname, publisher, price)" +
            "  values (#{bookId}, #{bookName}, #{publisher}, ${price})")
    int insertBook(BookDto bookDto);

    @Update("update book" +
            "set bookname = #{bookName}, " +
            "   publisher = #{publisher}, " +
            "       price = #{price} " +
            " where bookid = #{bookId} "
    )
    int updateBook(BookDto bookDto);

    @Delete("delete from book where bookid = #{bookid}")
    int deleteBook(int bookId);
}
