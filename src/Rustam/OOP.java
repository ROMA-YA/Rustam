package Rustam;

public class OOP {
    /* Дано: Корова, Ворона, Окунь,

Для всех этих видов:
- Найди 2 общих свойства
- Найди по 1 различию

Реализуй код таким образом, чтобы при запуске приложения в консоль выводилась информация о животном*/

    public static class animal{ // класс Животные, который хранит общие признаки
        public int eyes; // количество глаз
        public float weight; // вес в кг.
        public String name; // имя животного

        public void setValues(int eyes, float weight, String name){ // конструктор для выведения информации
            this.eyes = eyes;
            this.weight = weight;
            this.name = name;
        }
        public String getValues(){
            String info = "Я" + name + ", и у меня " + eyes + " глаза. Я вешу " + weight + "кг";
            return info;
        }
    }

    public static class cow extends animal{ // класс корова наследуется от класса животное
        public String Wool; // шерсть - индивидуальное отличие коровы
        public cow(String Wool){
            this.Wool = Wool;
        }

        @Override
        public void setValues(int eyes, float weight, String name) {
            super.setValues(eyes, weight, name);
        }

        @Override
        public String getValues(){
            String info = "Я" + name + ", и у меня " + eyes + " глаза. Я вешу " + weight + "кг";
            String distinctiveFeature = "Мое отличие - у меня есть ";
            return info;
        }
    }
    public static class crown extends  animal{ // класс ворона наследуется от класса животное
        public String wings; // крылья - индивидуальное отличие коровы
        public crown(String wings){
            this.wings = wings;
        }

        @Override
        public void setValues(int eyes, float weight, String name) {
            super.setValues(eyes, weight, name);
        }

    }
    public static class perch extends animal{ // класс окунь наследуется от класса животное
        public String scales; // чешуя - индивидуальное отличие коровы
        public perch (String scales){
            this.scales =scales;
        }

        @Override
        public void setValues(int eyes, float weight, String name) {
            super.setValues(eyes, weight, name);
        }
    }
    public void showInfo(){
        var cow = new animal();
        cow.setValues(2, 100f, "корова");
        String result = cow.getValues();
        System.out.println(result);


    }

    public static void main(String[] args) {
    }


}
//[20:54, 19.06.2025] +7 928 522-94-26: Привет!
//Я корова, и у меня 2 глаза. Я вешу 100 кг.
//Мое отличие - у меня есть шерсть
//[20:57, 19.06.2025] +7 928 522-94-26: 1.1) Вызов метода showInfo должен быть в методе main
//1.2) А теперь обнови код таким образом чтобы создание экземпляра класса животного происходило
// в методе main, а вызов метода showInfo() происходил в другом методе