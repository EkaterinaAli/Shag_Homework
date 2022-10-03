package homework19;

public class Horse extends Animal{
    private int wight;


    public Horse(String food, String location) {
        super(food, location);

    }
    public Horse(String food, String location, int wight) {
        super(food, location);
        this.wight = wight;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "wight=" + wight +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
    @Override
    public String makeNoise (){
        System.out.println("Лошадь говорит Игого");
        return super.makeNoise();
    }
    @Override
    public String eat() {
        System.out.println("Лошадь есть " + this.food);
        return super.eat();
    }
}
