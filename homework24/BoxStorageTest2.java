package homework24;

import java.util.ArrayList;
import java.util.List;

public class BoxStorageTest2 {
    public static void main(String[] args) {
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
