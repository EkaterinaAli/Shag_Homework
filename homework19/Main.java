package homework19;

public class Main {
    public static void main(String[] args) {
        Vet vet = new Vet();
        Animal[] mas = new Animal[3];
        Animal animal1 = new Cat("рыба", "дом");
        Animal animal2 = new Dog("мясо", "двор" );
        Animal animal3 = new Horse("сено", "Конюшня" );
        mas[0] = animal1;
        mas[1] = animal2;
        mas [2] = animal3;
         for (Animal rez : mas){
            vet.treatAnimal(rez);
        }
    }
}
