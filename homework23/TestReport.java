package homework23;

import homework17.Reader;

public class TestReport {
    public static void main(String[] args) {

        Report [] mas = new Report[3];
        Report employee1 = new Report("Иванов", 300.55);
        Report employee2  = new Report("Петров", 500.5);
        Report employee3  = new Report("Сидоров", 600.40);
        mas[0] = employee1;
        mas [1] = employee2;
        mas [2] =employee3;


        for ( Report res : mas) {
            System.out.println(res);}

        employee1.generateReport();
        employee2.generateReport();
        employee3.generateReport();
    }

}
