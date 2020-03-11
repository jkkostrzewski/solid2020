package pl.zzpj2020.solid.srp.book.solution;

import java.util.Map;

public class BookReader implements Readable{
    private Book book;
    private int currentPage = 0;

    public BookReader(Book book) {
        this.book = book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public void turnPage() { currentPage++; }

    public void readCurrentPage() {
        System.out.println(book.getPageContents(currentPage));
    }

    public String readAllPages() {

        String allPages = new String();
        for(Map.Entry<Integer, String> page : book.getPages().entrySet()) {
            allPages += (page.getKey() + " " + page.getValue());
        }
        return allPages;
    }
}
