package homework6;

import java.util.Scanner;

public class Start6 {
    public static void main (String [] args){
       /* //Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти
          //сумму элементов массива с номерами от K до L включительно.
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int size = scan.nextInt();
        System.out.print("Введите целое число К: ");
        int k = scan.nextInt();
        System.out.print("Введите целое число L: ");
        int l = scan.nextInt();
        int [] mas = new int[size];
        for (int i = 0; i < mas.length; i++ ) {
            int a = (int)(Math.random()*10) ;
            mas[i] = a;
            System.out.print( i + " - " + mas[i] + ", " + " ");
        }
        System.out.println();
        int sum = 0;
        for (int i = k; i <= l; i++){
            sum = sum + mas[i];
        }
        System.out.println("Сумма элементов массива с номерами от " + k + " до " + l + " равна "+ sum);
                */

        /*//Array21. Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N).
        //Найти среднее арифметическое элементов массива с номерами от K до L включительно
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите размер массива N: ");
        int n = scan.nextInt();;
        System.out.print("Введите целое число K: ");
        int k = scan.nextInt();
        System.out.print("Введите цело число L: ");
        int l = scan.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++ ) {
            int a = (int) (Math.random()*10);
            mas[i] = a;
            System.out.print( i + " - " + mas[i] + ", " + " ");
        }
        int sum = 0;
        int kol = 0;
        for (int i = k; i <= l; i++) {
            sum +=mas[i];
            kol ++ ;
            }
        System.out.println();
        System.out.println("Среднее арифметическое элементов массива от "+ k +  " до " +  l + " равно " + (double)sum/kol);
                 */

        /*//Array22. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти
        //сумму всех элементов массива, кроме элементов с номерами от K до L включительно.
        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива N ");
        int n = in.nextInt();;
        System.out.print("Введите целое число K ");
        int k = in.nextInt();
        System.out.print("Введите целое числo L ");
        int l = in.nextInt();

        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++ ){
            int a = (int) (Math.random()*10);
            mas[i] = a;
            System.out.println(i + " - " + mas[i] + ", " + " ");
        }
        int sum = 0;
        for (int i = 0; i < k; i++ ) {
            sum +=mas[i];
        }
        for (int i = l+1; i < n; i++) {
            sum +=mas[i];
        }
        System.out.println( "Сумма всех элементов массива, кроме от " + k + " до " + l + " включительно равна " + sum);
                 */
        //Array23. Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N).
        //Найти среднее арифметическое всех элементов массива, кроме элементов
        //с номерами от K до L включительно.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите размер массива N ");
        int n = in.nextInt();;
        System.out.print("Введите целое число K ");
        int k = in.nextInt();
        System.out.print("Введите целое числo L ");
        int l = in.nextInt();

        int[] mas = new int[n];
        for (int i = 0; i < mas.length; i++ ){
            int a = (int) (Math.random()*10);
            mas[i] = a;
            System.out.println(i + " - " + mas[i] + ", " + " ");
        }
        int sum = 0;
        int kol = 0;
        for (int i = 0; i < k; i++ ) {
            sum +=mas[i];
            kol++;
        }
        for (int i = l+1; i < n; i++) {
            sum +=mas[i];
            kol ++;
        }
        System.out.println( "Cреднее арифметическое всех элементов массива, кроме от " + k + " до " + l + " включительно равна " + (double)sum/kol);
        //



    }
}
