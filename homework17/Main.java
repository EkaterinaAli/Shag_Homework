package homework17;

public class Main {
    public static void main (String[] args){

        Reader r1 = new Reader("Иванов И.И.", 1, "ФТК", "1.01.2001",375291111 );
        Reader r2 = new Reader("Сидоров С.С.", 2, "ФС", "2.02.2002", 375292222);
        Reader r3 = new Reader("Петров П. П.", 3, "ФЭС", "3.03.2003", 375293333);
        Reader [] mas  = {r1,r2,r3};
        for ( Reader res : mas) {
            System.out.println(res);}

        r1.takeBook (1);
        r1.takeBook ("Приключения");

        r2.takeBook(2);
        r2.takeBook("Приключения, Словарь");

        r3.takeBook(3);
        r3.takeBook("Приключения, Словарь, Энциклопедия");
        System.out.println();

        r1.returnBook(1);
        r1.returnBook("Приключения");

        r2.returnBook(2);
        r2.returnBook("Приключения, Словарь");
        r3.returnBook(3);
        r3.returnBook("Приключения, Словарь, Энциклопедия");

        Book [] masBook = new Book[3];
        Book book1 = new Book("Приключения",  "Том Хэнк" );
        Book book2  = new Book ("Словарь", "Б. Ветлицкий");
        Book book3  = new Book("Энциклопедия","П.Попов");

        masBook [0] = book1;
        masBook [1] = book2;
        masBook [2] = book3;
        for (Book arrB : masBook){
            System.out.println(arrB);
        }

        r1.takeBook(book1, book2, book3);
        r2.takeBook(book2);
        r3.takeBook(book3, book2);
        r1.returnBook(book1,book3);
    }
}
