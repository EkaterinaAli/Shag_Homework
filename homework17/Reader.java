package homework17;

public class Reader {
    private String fio;
    private int number;
    private String facultet;
    private String date;
    private long numberPhone;

    public Reader ()
    {}

    public  Reader ( String fio, int number, String facultet, String date, long numberPhone){
        this.fio =fio;
        this.number = number;
        this.facultet = facultet;
        this.date = date;
        this.numberPhone = numberPhone;
    }

    public String getFio() { return fio;}
    public void setFio(String fio) {this.fio = fio; }
    public int getNumber() {return number;}
    public void setNumber(int number) { this.number = number; }
    public String getFacultet() {return facultet;}
    public void setFacultet(String facultet) { this.facultet = facultet;  }
    public String getDate() {return date; }
    public void setDate(String date) { this.date = date; }
    public long getNumberPhone() {return numberPhone;}
    public void setNumberPhone(long numberPhone) {  this.numberPhone = numberPhone; }

    public void takeBook(int numberBook ){
        System.out.println( getFio()+ " взял " + numberBook + " книги");
    }
    public void takeBook (String nameBook){
        System.out.println(getFio() + " взял книги: " + nameBook);
    }
    public void takeBook(Book book) {
        System.out.println(getFio() + " взял книги: " + book.getNameBook());
    }
    public void returnBook(int number) {
        System.out.println(getFio() + " вернул " + number + " книги.");
    }
    public void returnBook(String nameBook) {
        System.out.println(getFio() + " вернул следующие книги:" + nameBook);

    }
}


