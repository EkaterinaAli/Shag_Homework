package homework19.figury;

public class Main {
    public static void main(String[] args) {
        Shape [] mas =new Shape[3];
        mas[0] = new Circle("Красный", 1,2,15);
        mas [1] = new Rectangle("зеленый", 2,3,4,5);
        mas[2] = new Circle("Красный", 1,2,15);

        for (Shape rez : mas) {
            System.out.println(rez);
            rez.draw();
        }
        System.out.println("Сравнивание кругов " + mas[0].equals(mas[2]) );

    }
}
