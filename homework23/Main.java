package homework23;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Введите слово: ");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        //4. Найти два средних знака строки
        //Даны строки разной длины (длина - четное число), необходимо вернуть ее два средних знака.
        // Например, если дана строка "string"  результат будет "ri", для строки "code" результат "od",
        // для "Practice" результат "ct".
        System.out.print(str.substring(str.length() / 2 - 1, str.length() / 2 + 1));
    }
}
