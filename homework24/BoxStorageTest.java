package homework24;

import java.util.ArrayDeque;
import java.util.Queue;

public class BoxStorageTest {

    public static void main(String[] args) {
        //5. Создать очередь
        //Создать очередь, содержащую объекты класса HeavyBox.
        //Используем класс ArrayDeque.
        //Поместить объекты в очередь с помощью метода offer().
        //Удалить объекты методом poll().
        Queue<HeavyBox> boxQueue = new ArrayDeque<>();
        Queue<HeavyBox> heavyBoxes = new ArrayDeque<>();
        boxQueue.offer(new HeavyBox(10));
        boxQueue.offer(new HeavyBox(5));
        boxQueue.offer(new HeavyBox(20));

        System.out.println("Сейчас в очереди добавлено " + boxQueue.size() + " коробок.");
        System.out.println(boxQueue.poll() + " убирается");
        System.out.println("Сейчас в очереди " + boxQueue.size() + " коробки.");
    }
}