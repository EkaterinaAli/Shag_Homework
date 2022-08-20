package homework7;

import java.util.Scanner;

//Алисионок Екатерина
public class Start7 {
    public static void main (String [] args) {
        /*//Proc17. Описать функцию RootsCount(A, B, C) целого типа, определяющую
        //количество корней квадратного уравнения A·x^2 + B·x + C = 0 (A, B, C —
        //вещественные параметры, A 6= 0). С ее помощью найти количество корней
        //для каждого из трех квадратных уравнений с данными коэффициентами.
        //Количество корней определять по значению дискриминанта:
        //D = B^2 − 4·A·C.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++ ) {
            System.out.print("Введите значение А ");
            double a = in.nextDouble();
            System.out.print("Введите значение B ");
            double b = in.nextDouble();
            System.out.print("Введите значение C ");
            double c = in.nextDouble();
            System.out.println("Количество корней в квадратном уравнении = " + rootsCount(a,b,c));
        }
                 */
       /* //Proc18. Описать функцию CircleS(R) вещественного типа, находящую площадь круга радиуса R (R — вещественное). С помощью этой функции
        //найти площади трех кругов с данными радиусами. Площадь круга радиуса R вычисляется по формуле S = π·R^2
        //. В качестве значения π использовать 3.14.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++  ) {
            System.out.print("ВВЕДИТЕ РАДИУС КРУГА R ");
            double r = in.nextDouble();
            System.out.println("Площадь круга с радиусом " + r + " равна " + circleS(r));
        }
                */
        /*//Proc19. Описать функцию RingS(R1, R2) вещественного типа, находящую площадь кольца, заключенного между двумя
        // окружностями с общим центром и радиусами R1 и R2 (R1 и R2 — вещественные, R1 > R2). С ее помощью найти
        // площади трех колец, для которых даны внешние и внутренние радиусы. Воспользоваться формулой площади
        // круга радиуса R: S = π·R^2. В качестве значения π использовать 3.14.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("ВВЕДИТЕ РАДИУС КРУГА R1 ");
            double r1 = in.nextDouble();
            System.out.print("ВВЕДИТЕ РАДИУС КРУГА R2 ");
            double r2 = in.nextDouble();
            System.out.println("Площадь кольца с равна " + ringS(r1, r2));
        }
        */
        /*//Proc20. Описать функцию TriangleP(a, h), находящую периметр равнобедренного треугольника по его основанию a
        // и высоте h, проведенной к основанию (a и h — вещественные). С помощью этой функции найти периметры трех
        // треугольников, для которых даны основания и высоты. Для нахождения боковой стороны b треугольника
        // использовать теорему Пифагора: b^2 = (a/2)^2 + h^2.
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.print("ВВЕДИТЕ ОСНОВАНИЕ ТРЕУГОЛЬНИК а ");
            double a = in.nextDouble();
            System.out.print("ВВЕДИТЕ ВЫСОТУ ТРЕУГОЛЬНИКА h ");
            double h = in.nextDouble();
            System.out.println("Периметр треугольника равен  " + triangleP(a, h));
        }
        */
        //Proc21◦Описать функцию SumRange(A, B) целого типа, находящую сумму
        //всех целых чисел от A до B включительно (A и B — целые). Если A > B,
        //то функция возвращает 0. С помощью этой функции найти суммы чисел
        //от A до B и от B до C, если даны числа A, B, C.
        Scanner in = new Scanner(System.in);

            System.out.print("ВВЕДИТЕ число а ");
            int a = in.nextInt();
            System.out.print("ВВЕДИТЕ число b ");
            int b = in.nextInt();
            System.out.print("ВВЕДИТЕ число c ");
            int c = in.nextInt();
            System.out.println("Сумма чисел от " + a + " до " + b + " равна " + sumRange(a, b));
            System.out.println("Сумма чисел от " + b + " до " + c + " равна " + sumRange(b, c));
    }
    static int rootsCount(double a, double b, double c){
        double d = b*b - 4*a*c;
        if (d < 0)
            return 0;
        else if (d == 0)
            return 1;
        else if (d > 0)
            return 2;
        return 0;
    }
    static double circleS(double r){
        return 3.14*r*r;
    }
    static double ringS(double r1, double r2){
        return 3.14*(r1*r1 - r2*r2);
    }
    static double triangleP(double a, double h){
        double b = Math.sqrt(a/2*a/2 + h*h);
        return b*2+a;
    }
    static int sumRange(int x, int y){
        int sum = 0;
        if (x > y){
            return 0;
        } else
              for (int i = x; i <= y; i++) {
              sum +=i;
        }
            return sum;
    }
}
