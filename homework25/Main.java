package homework25;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //Задание 2
    //Необходимо разработать приложение, которое позволит сохранять информацию о логинах пользователей
    //и их паролях. Каждому пользователю соответствует пара логин — пароль. При старте приложение отображается
    //меню:
    //1. Добавить нового пользователя.
    //2. Удалить существующего пользователя.
    //3. Проверить существует ли пользователь.
    //4. Изменить логин существующего пользователя.
    //5. Изменить пароль существующего пользователя.
    //В зависимости от выбора пользователя выполняется действие, после чего меню отображается снова. Для
    //решения задачи используйте подходящий класс из Java Collections Framework.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice;
        List<User> st = new ArrayList<>();

        while (true) {
            printMenu();
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    addNewUser(st);
                    break;
                case 2:
                    deleteElem(st);
                    break;
                case 3:
                    checkList(st);
                    break;
                case 4:
                    changeName(st);
                    break;
                case 5:
                    changePassword(st);
                    break;
                case 6:
                    System.out.println();
                    printList(st);
                    System.out.println();
                    break;
                case 7:
                    return;
                default:
                    System.out.println("Нет такого пункта в меню");
            }
        }
    }

    static void printMenu() {
        System.out.println("1. Добавить нового пользователя.");
        System.out.println("2. Удалить существующего пользователя.");
        System.out.println("3. Проверить существует ли пользователь.");
        System.out.println("4. Изменить логин существующего пользователя.");
        System.out.println("5. Изменить пароль существующего пользователя.");
        System.out.println("6. Показать список ");
        System.out.println("7. Выход");
        System.out.print("Введите номер нужного пункта: ");
    }

    static void addNewUser(List<User> listUser) {
        if (listUser != null) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя: ");
            String nameUser = in.nextLine();
            System.out.println("Введите пароль: ");
            int passwordUser = in.nextInt();
            listUser.add(new User(nameUser, passwordUser));
        } else {
            System.out.println("Список пустой ");
        }
    }

    static void deleteElem(List<User> listUser) {
        System.out.println("Удалить пользователя ");
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя пользователя ");
        String name = in.nextLine();
        System.out.println("Введите пароль пользователя ");
        int pass = in.nextInt();
        User user = new User(name, pass);
        if (listUser.contains(user)) {
            listUser.remove(user);
        } else {
            System.out.println("Нет такого пользователя ");
        }
    }
    static void printList(List<User> listUser) {
        System.out.println("Cодержимое списка: ");
        System.out.println(listUser.toString());
    }

    static void checkList(List<User> listUser) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите пользователя которого нужно проверить ");
        System.out.println("Введите имя пользователя ");
        String name = in.nextLine();
        System.out.println("Введите пароль пользователя ");
        int pass = in.nextInt();
        User user = new User(name, pass);
        if (listUser.contains(user)) {
            System.out.println("Есть такой пользователь ");
        } else {
            System.out.println("Нет такого пользователя ");
        }
    }

    static void changeName(List<User> listUser) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите имя которое нужно изменить");
        String name = in.nextLine();
        boolean flag = true;
        for (User user : listUser) {
            if (user.getUserName().equals(name)) {
                System.out.println("Введите новый логин ");
                user.setUserName(in.nextLine());
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Нет такого пользователя ");
        }
    }
    static void changePassword(List<User> listUser) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин в котором нужно изменить пароль ");
        String name = in.nextLine();
        boolean flag = true;
        for (User user : listUser) {
            if (user.getUserName().equals(name)) {
                System.out.println("Введите новый пароль ");
                user.setPassword(in.nextInt());
                flag = false;
                break;
            }
        }
        if (flag) {
            System.out.println("Нет такого пользователя ");
        }
    }
}


