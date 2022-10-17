package homework23;

import java.util.Formatter;

public class Student {
    public static void formatPrint(String surname, int grade, String subject){
        Formatter f = new Formatter();
        f.format( "Студент %-15s получил %-3d по %-10s", surname,grade,subject);
        System.out.println(f);
    }
    public static void main(String[] args) {
        //Создать строку, используя форматирование: Студент [Фамилия] получил [оценка] по [предмету].
        // Форматирование и вывод строки на консоль написать в отдельном методе,
        // который принимает фамилию, оценку и название предмета в качестве параметров.
        // Выделить под фамилию 15 символов, под оценку 3 символа, под предмет – 10.
        //Пример вывода:
        //Студент Иванов          получил 5   по Математике
        //Студент Петрова         получил 4   по Физике
        //Студент Сидорова        получил 3   по Программированию
        formatPrint("Иванов", 5 , "Математике");
        formatPrint("Петров", 4 , "Физике");
        formatPrint("Сидоров", 3 , "Программированию");


    }
}
