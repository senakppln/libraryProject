/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author senak
 */
import java.io.Serializable;

public class Book implements Serializable {

    private String writer;
    private String bookName;
    private String page;

    Book(String tfbookName, String tfwriterName, String tfpage) {
        this.bookName = tfbookName;
        this.writer = tfwriterName;
        this.page = tfpage;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getPage() {
        return page;
    }

    public void setPage(String page) {
        this.page = page;
    }

}
