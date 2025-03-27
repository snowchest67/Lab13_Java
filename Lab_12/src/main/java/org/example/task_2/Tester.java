package org.example.task_2;

    public class Tester {
        private String name;
        private String surname;
        private int experienceInYears;
        private String englishLevel;
        private double salary;


        public Tester(String name) {
            this(name, "Неизвестно");
        }


        public Tester(String name, String surname) {
            this(name, surname, 0);
        }


        public Tester(String name, String surname, int experienceInYears) {
            this(name, surname, experienceInYears, "Неизвестно", 0.0);
        }


        public Tester(String name, String surname, int experienceInYears, String englishLevel, double salary) {
            this.name = name;
            this.surname = surname;
            this.experienceInYears = experienceInYears;
            this.englishLevel = englishLevel;
            this.salary = salary;
        }

        public void work() {
            System.out.println(name + " " + surname + " работает");
        }

        public void work(int hours) {
            System.out.println(name + " " + surname + " работает " + hours + " часов");
        }

        public void work(int hours, String project) {
            System.out.println(name + " " + surname + " работает над " + project + " " + hours + " часов");
        }

        public static void printTesterDetails(Tester tester) {
            System.out.println("Имя: " + tester.name);
            System.out.println("Фамилия: " + tester.surname);
            System.out.println("Опыт: " + tester.experienceInYears + " часов");
            System.out.println("Уровень английского: " + tester.englishLevel);
            System.out.println("Зарплата: " + tester.salary);
        }

        @Override
        public String toString(){
            return " Имя: " + name + " Фамилия: " + surname + " Опыт: " + experienceInYears + " Уровень английского: " + englishLevel + " Зарплата: " + salary;
        }
    }

