package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private BookLocation bookLocation;
    private Map<Integer, String> pages;

    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public String getPageContents(int page) { return pages.get(page); }
    public Map<Integer, String> getPages() { return pages; }
    public void setBookLocation(BookLocation bookLocation) {
        this.bookLocation = bookLocation;
    }

    public Book() {
        pages = new HashMap<>();
    }
}
