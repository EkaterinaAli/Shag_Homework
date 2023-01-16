package homework26;

import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

/*Задание 4
        Создайте класс Телевизор. Он должен хранить ин-
        формацию о названии модели, год выпуска, цена, диаго-
        наль, производитель. Нужно создать набор телевизоров
        и выполнить следующие задачи:
        ■ Показать все телевизоры;
        ■ Показать телевизоры с заданной диагональю;
        ■ Показать все телевизоры одного производителя;
        ■ Показать все телевизоры текущего года;
        ■ Показать все телевизоры дороже заданной цены;
        ■ Показать все телевизоры, отсортированные по цене
        по возрастанию;
        ■ Показать все телевизоры, отсортированные по цене
        по убыванию.
        ■ Показать все телевизоры, отсортированные по диа-
        гонали по возрастанию;
        ■ Показать все телевизоры, отсортированные по диа-
        гонали по убыванию.

 */
class TV {
    private String model;
    private int yearOfProd;
    private int price;
    private int diagonal;
    private String producer;

    public TV(String model, int yearOfProd, int price, int diagonal, String producer) {
        this.model = model;
        this.yearOfProd = yearOfProd;
        this.price = price;
        this.diagonal = diagonal;
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public int getYearOfProd() {
        return yearOfProd;
    }

    public int getPrice() {
        return price;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public String getProducer() {
        return producer;
    }

    @Override
    public String toString() {
        return "TV{" +
                "модель " + model +
                ", год выпуска " + yearOfProd +
                ", цена " + price +
                ", диагональ " + diagonal +
                ", производитель " + producer +
                '}';
    }
}
public class Task6 {
    public static void main(String[] args) {
        List<TV> TVList = new ArrayList<>();
        TVList.add(new TV("TN123",2015,100,32,"LG"));
        TVList.add(new TV("RT456",2017,200,32,"Samsung"));
        TVList.add(new TV("QW789",2020,350,38,"LG"));
        TVList.add(new TV("TN123",2022,400,40,"Horizont"));
        TVList.add(new TV("QW789",2019,250,34,"Samsung"));

        TVList.stream().forEach(x -> System.out.println(x + " "));
        System.out.println();
        TVList.stream().filter(x ->x.getDiagonal() ==32 ).forEach( x-> System.out.println(x + " "));
        System.out.println();

        TVList.stream().filter(x ->x.getProducer().equals("Samsung")).forEach( x-> System.out.println(x + " "));
        System.out.println();
        TVList.stream().filter(x ->x.getProducer().equals("LG")).forEach( x-> System.out.println(x + " "));
        System.out.println();
        TVList.stream().filter(x ->x.getProducer().equals("Horizont")).forEach( x-> System.out.println(x + " "));
        System.out.println();
        TVList.stream().filter(x ->x.getYearOfProd() ==2022 ).forEach( x-> System.out.println(x + " "));
        System.out.println();
        TVList.stream().filter(x ->x.getPrice() >200 ).forEach( x-> System.out.println(x + " "));
        System.out.println();

        List <TV> sortedListPrice = TVList.stream().sorted(Comparator.comparingInt(TV :: getPrice))
                .collect(Collectors.toList());
        sortedListPrice.forEach(System.out::println);
        System.out.println();

        List <TV> sortedListPriceRevers = TVList.stream().sorted(Comparator.comparingInt(TV :: getPrice).reversed())
                .collect(Collectors.toList());
        sortedListPriceRevers.forEach(System.out::println);
        System.out.println();

        List <TV> sortedListDiagonal = TVList.stream().sorted(Comparator.comparingInt(TV :: getDiagonal))
                .collect(Collectors.toList());
        sortedListDiagonal.forEach(System.out::println);
        System.out.println();

        List <TV> sortedListDiagonalRevers = TVList.stream().sorted(Comparator.comparingInt(TV :: getDiagonal).reversed())
                .collect(Collectors.toList());
        sortedListDiagonalRevers.forEach(System.out::println);
        System.out.println();
    }
}
