package homework8;

import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrA = new ArrayList<>();
       /* //задан массив Аб содержащий 10 целых случайных чисел от 0 до 20. Найти произведние элементов этого массива.
        fillRandom(arrA,0,20,10);
        print(arrA);
        System.out.println("Произведение элементов массива равно " + proiz(arrA));

        */
        /*//задан массив, который содержит 8 случайных целых чисел от - 10 до 10. Найти сумму положительных элементов.
        fillRandom(arrA, -10, 10, 8);
        print(arrA);
        System.out.print("Сумму положительных элементов массива  " + summPol(arrA));

         */

        /*//задан массив, который содержит 16 случайных целых чисел от 0 до 20. Найти количество
        // элементов, которые делятся на 3 и на 5.
        fillRandom(arrA, 0, 20, 16);
        print(arrA);
        System.out.println(" Количество элементов, которые делятся на 3 и на 5 равно " + kol(arrA));
         */

        //задан массив из 9 целых чисел от -10 до 10. Найти сумму элементов массиваб которые являются четными.
        fillRandom(arrA, -10, 10, 9);
        print(arrA);
        System.out.println("Сумма четных элементов массива " + summChetEL(arrA));
    }

    static void fillRandom(ArrayList<Integer> mas, int left, int right, int qty) {
        Random gen = new Random();
        for (int i = 0; i < qty; i++) {
            mas.add(gen.nextInt(right - left + 1) + left);
        }
    }

    static void print(ArrayList<Integer> mas) {
        for (int i = 0; i < mas.size(); i++) {
            System.out.print(mas.get(i) + " ");
        }
    }

    static int proiz(ArrayList<Integer> mas) {
        int pr = 1;
        for (int i = 1; i < mas.size(); i++) {
            pr *= mas.get(i);
        }
        System.out.println();
        return pr;
    }

    static int summPol(ArrayList<Integer> mas) {
        int summ = 0;
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) > 0) {
                summ += mas.get(i);
            }
        }
        System.out.println();
        return summ;
    }

    static int kol(ArrayList<Integer> mas) {
        int kol = 0;
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) % 3 == 0 && mas.get(i) % 5 == 0) {
                kol++;
            }
        }
        System.out.println();
        return kol;
    }

    static int summChetEL(ArrayList<Integer> mas) {
        int sum = 0;
        for (int i = 0; i < mas.size(); i++) {
            if (mas.get(i) % 2 == 0) {
                sum += mas.get(i);
            }
        }
        System.out.println();
        return sum;
    }
}
