package homework24;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BoxStorageTest {

    public static void main(String[] args) {
        //5. Создать очередь
        //Создать очередь, содержащую объекты класса HeavyBox.
        //Используем класс ArrayDeque.
        //Поместить объекты в очередь с помощью метода offer().
        //Удалить объекты методом poll().
        Queue<HeavyBox> boxQueue = new ArrayDeque<>();

        boxQueue.offer(new HeavyBox(10));
        boxQueue.offer(new HeavyBox(5));
        boxQueue.offer(new HeavyBox(20));

        System.out.println("Сейчас в очереди добавлено " + boxQueue.size() + " коробок.");
        System.out.println(boxQueue.poll() + " убирается");
        System.out.println("Сейчас в очереди " + boxQueue.size() + " коробки.");
        // 6. Разделение коллекции
        //Создать коллекцию, содержащую объекты HeavyBox.
        // Написать метод, который перебирает элементы коллекции и проверяет вес коробок.
        // Если вес коробки больше 300 гр, коробка перемещается в другую коллекцию.
        List<HeavyBox> boxSmall = new ArrayList<>();
        List <HeavyBox> boxBig = new ArrayList<>();
        boxSmall.add(new HeavyBox(500));
        boxSmall.add(new HeavyBox(200));
        boxSmall.add(new HeavyBox(100));
        boxSmall.add(new HeavyBox(900));
        System.out.println("Коробки до сортировки " + boxSmall);
        sortBox(boxSmall,boxBig);
        System.out.println("Коробки после сортирвки " + boxBig);
    }
    public static void sortBox (List <HeavyBox> boxSmall, List<HeavyBox> boxBig) {

        for (HeavyBox boxes : boxSmall) {
            if (boxes.getWeight() > 300 ){
                boxBig.add(boxes);
            }
            boxSmall.remove(boxBig);
        }
    }
}

