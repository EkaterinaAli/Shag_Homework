package homework19;

public class Cat extends Animal{
    private String color;

    public Cat(String food, String location) {
        super(food, location);

    }
    public Cat(String food, String location, String color) {
        super(food, location);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", food='" + getFood() + '\'' +
                ", location='" + getLocation() + '\'' +
                '}';
    }

    @Override
    public String makeNoise (){
        System.out.println("Кошка говорит мяумяу");
        return super.makeNoise();
    }

    @Override
    public String eat() {
        System.out.println("Кошка ест " + this.food);
        return super.eat();
    }
}
