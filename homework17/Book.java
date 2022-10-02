package homework17;
public class Book {
    private String nameBook;
    private String autorBook;
    public Book () {
    }
    public Book (String nameBook, String autorBook) {
        this.nameBook = nameBook;
        this.autorBook = autorBook;
    }
    public String getNameBook() {
        return nameBook;
    }
    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }
    public String getAutorBook() {
        return autorBook;
    }
    public void setAutorBook(String autorBook) {
        this.autorBook = autorBook;
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameBook='" + nameBook + '\'' +
                ", autorBook='" + autorBook + '\'' +
                '}';
    }
}
