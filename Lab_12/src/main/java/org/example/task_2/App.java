package org.example.task_2;

public class App {
    public static void main(String[] args) {
        Tester tester = new Tester("Тимофей", "Логвин", 5, "B1", 50000.0);
        Tester.printTesterDetails(tester);
        tester.work();
        tester.work(3);
        tester.work(3, "Мобильное приложение трекер эмоций");

    }
}
