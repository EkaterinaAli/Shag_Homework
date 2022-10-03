package homework19.figury;

import java.util.Objects;

public class Rectangle extends Shape {
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public Rectangle(String color, int x1, int y1, int x2, int y2) {
        super(color);
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

   public void draw() {
       System.out.println("Нарисован квадрат ");
   }

    @Override
    public String toString() {
        return "Rectangle " +
                "x1=" + x1 +
                ", y1=" + y1 +
                ", x2=" + x2 +
                ", y2=" + y2 +
                ' ';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Rectangle rectangle = (Rectangle) o;
        return x1 == rectangle.x1 && y1 == rectangle.y1 && x2 == rectangle.x2 && y2 == rectangle.y2;
    }


}
