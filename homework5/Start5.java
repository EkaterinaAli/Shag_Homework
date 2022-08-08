package homework5;

import java.util.Scanner;

public class Start5 {
    public static void main (String [] args){
        /*//Series4. Дано целое число N и набор из N вещественных чисел. Вывести
        //сумму и произведение чисел из данного набора.
        double sum = 0;
        double pr = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            sum = sum + x;
            pr = pr * x;
        }
        System.out.println("Сумма = " + sum);
        System.out.println("Произведение = " + pr);
                 */

       /* //Series5. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке целые части всех чисел из данного
        //набора (как вещественные числа с нулевой дробной частью), а также
        //сумму всех целых частей.
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            x = Math.floor(x);
            System.out.println("Целая часть  " + x);
            sum = sum + x;
        }
        System.out.println("Сумма = " + sum);
        */
        /*//Series6. Дано целое число N и набор из N положительных вещественных
        //чисел. Вывести в том же порядке дробные части всех чисел из данного набора
        // (как вещественные числа с нулевой целой частью), а также произведение всех дробных частей.
        double pr = 1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            x =x-Math.floor(x) ;
            System.out.println("Дробная часть  " +  x);
            pr = pr *  x;
        }
        System.out.println("Произведение = " + pr);
                 */
       /*//Series7. Дано целое число N и набор из N вещественных чисел. Вывести в
        //том же порядке округленные значения всех чисел из данного набора (как
        //целые числа), а также сумму всех округленных значений.
        double sum = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите вещественное число ");
            double x = in.nextDouble();
            x = Math.round(x);
            System.out.println("Округленные значения  " + (int)x);
            sum = sum + x;
        }
        System.out.println("Сумма = " + (int)sum);
                */
       /*//Series8. Дано целое число N и набор из N целых чисел. Вывести в том же
        //порядке все четные числа из данного набора и количество K таких чисел.
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите целое число ");
            int x = in.nextInt();
            if ( x % 2 == 0) {
                System.out.println("Четное число  " + x);
                ++k;
            }
        }
        System.out.println("Количество четных чисел = " + k);
                */
        /*//Series9. Дано целое число N и набор из N целых чисел. Вывести в том же
        //порядке номера всех нечетных чисел из данного набора и количество K таких чисел.
        int k = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите целое число ");
            int x = in.nextInt();
            if ( x % 2 != 0) {
                System.out.println("Нечетное число  " + x);
                ++k;
            }
        }
        System.out.println("Количество нечетных чисел = " + k);
                 */
        /*//Series10. Дано целое число N и набор из N целых чисел. Если в наборе
        //имеются положительные числа, то вывести TRUE; в противном случае вывести FALSE.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите целое число ");
            int x = in.nextInt();
            if ( x >= 0) {
                System.out.println("TRUE");
            }
                else {
                    System.out.println("FALSE");
                }
        }
          */
        //Series11. Даны целые числа K, N и набор из N целых чисел. Если в наборе
        //имеются числа, меньшие K, то вывести TRUE; в противном случае вывести FALSE.

        Scanner in = new Scanner(System.in);
        System.out.print("Введите целое число K ");
        int k = in.nextInt();
        System.out.print("Введите целое число N ");
        int n = in.nextInt();
        for(int i = 1; i<=n; i++){
            System.out.print("Введите целое число ");
            int x = in.nextInt();
            if ( x < k) {
                System.out.println("TRUE");
            }
            else {
                System.out.println("FALSE");
            }
        }

    }
}
