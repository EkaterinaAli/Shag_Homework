package homework14;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void fillMatrix(int[][] arr, int left, int right) {
        Random gen = new Random();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = gen.nextInt(right - left + 1) + left;
            }
        }
    }

    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int proiz (int arr[][], int k ){
        int pr = 1;
        for (int i = 0; i < arr[k].length; i++) {
                pr *= arr[i][k];
            }
        return pr;
        }
    static void showСolumn (int[][] arrayName, int k) {
        if (k < 0 || k >= arrayName.length) {
            System.out.println("Ошибка. Нет такого столбца");
        } else {
            for (int i = 0; i < arrayName[k].length; i++) {
                System.out.println(arrayName[i][k] + " ");
            }
            System.out.println();
        }
    }
    static void printOddRows(int[][] arrayName) {
        for (int i = 1; i < arrayName.length; i += 2) {
            for (int j = 0; j < arrayName[i].length; j++) {
                System.out.print(arrayName[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int sumOfRow(int[][] arrayName, int k) {
        int sum = 0;
        for (int j = 0; j < arrayName[k].length; j++) {
            sum += arrayName[k][j];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int n = 5;
        final int m = 7;
        int[][] mas = new int[n][m];

        //Matrix20. Дана матрица размера M × N. Для каждого столбца матрицы найти
        //произведение его элементов.
      /* fillMatrix(mas,1,3);
        printMatrix(mas);
        int k;
        do {
            System.out.println("Введите номер столбца ");
            k = in.nextInt();
        } while (k< 0 || k >= mas[k].length);
        System.out.println(k + "-й столбец ");
        showСolumn(mas,k);
        System.out.println("Произведение элеменов " + k + "-oго столбца  " + proiz(mas,k));
               */
        //Matrix21. Дана матрица размера M × N. Для каждой строки матрицы с нечетным номером (1, 3, . . .)
        // найти среднее арифметическое ее элементов. Условный оператор не использовать

        fillMatrix(mas,1,3);
        printMatrix(mas);
        System.out.println( "Строки с нечетными номерами ");
        printOddRows(mas);
        for (int i = 1; i < mas.length; i+=2) {
            sumOfRow(mas,i);
            System.out.println("Cреднее арифметическое равно " + (double) sumOfRow(mas, i)/ mas[i].length );
        }
    }
}
