package homework19;

public class Dog extends Animal{
    private String breed;

    public Dog(String food, String location) {
        super(food, location);

    }
   public Dog(String food, String location, String breed) {
        super(food, location);
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                ", food='" + food + '\'' +
                ", location='" + location + '\'' +
                '}';
    }

    @Override
    public String makeNoise (){
        System.out.println("Собака говорит ГАВГАВ ");
        return super.makeNoise();
    }

    @Override
    public String eat() {
        System.out.println("Собака ест " + this.food);
        return super.eat();

    }
}
