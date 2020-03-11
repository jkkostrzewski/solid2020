package pl.zzpj2020.solid.srp.book.solution;

public class BookLocation {
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;


    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }
}
