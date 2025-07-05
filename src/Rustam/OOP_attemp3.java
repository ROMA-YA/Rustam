package Rustam;

public class OOP_attemp3 {
    /* Дано: Корова, Ворона, Окунь,
Для всех этих видов:
- Найди 2 общих свойства
- Найди по 1 различию

Реализуй код таким образом, чтобы при запуске приложения в консоль выводилась информация о животном*/

    public static class Animal{
        public int eyes; // количество глаз
        public float weight; // общий вес в кг
        public String name; //  имя


        //убличный конструктор для общих свойств
        public Animal(int eyes, float weight, String name){
            this.eyes = eyes;
            this.weight = weight;
            this.name = name;

        }

        // ввывод общей информации
        public String getinfo(){
            return "Привет! Я " + name + ", и у меня " + eyes + " глаза. Я вешу " + weight + " кг.";
        }
        //вывод уникального свойства класса наследника
        public String distinctiveFeature(){

            return "уникальное свойство" ;
        }

    }

    // корова
    public static class Cow extends Animal {
        public String wool; // уникальное свойство - шерсть
        public Cow(int eyes, float weight, String name, String wool) {
            super(eyes, weight, name);
            this.wool = wool;
        }
        @Override
        public String distinctiveFeature() {
            return "Мое отличие - у меня есть " + wool;
        }


    }
    // ворона
    public static class Crow extends Animal{
        public String wings; // уникальное свойство - крылья
        public Crow(int eyes, float weight, String name, String wings) {
            super(eyes, weight, name);
            this.wings = wings;
        }
        @Override
        public String distinctiveFeature() {
            return "Мое отличие - у меня есть " + wings;
        }
    }

    // окунь
    public static class Perch extends Animal {
        public String scales; // уникальное свойство - чешуя
        public Perch(int eyes, float weight, String name, String scales) {
            super(eyes, weight, name);
            this.scales = scales;
        }
        @Override
        public String distinctiveFeature() {
            return "Мое отличие - у меня есть " + scales;
        }
    }

    // метод для вывода общей информации
    public static void showInfo(Animal animal){
        System.out.println(animal.getinfo());
        System.out.println(animal.distinctiveFeature());
    }

    public static void main(String[] args) {
        Cow cow = new Cow(2,100f, "корова", "шерсть");
        Crow crow = new Crow(2,9f, "ворона", "крылья");
        Perch perch = new Perch(2,2f, "окунь", "чешуя");


        showInfo(cow);
        showInfo(crow);
        showInfo(perch);

    }

}
