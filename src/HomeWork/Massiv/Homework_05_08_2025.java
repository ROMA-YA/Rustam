package HomeWork.Massiv;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_05_08_2025 {
    public static void main(String[] args) {
        //task1();
        //task2();
         //task3();
        //task4();
        //task5();
        task6();
    }

    public static void task1(){

        //Задача 1. Максимум из трёх чисел
        //=======================
        //Напиши программу, которая принимает три числа и выводит наибольшее из них.

        System.out.print("введите 3 числа: ");
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int[] max3Numbers = new int[3];
        for (int i = 0; i <max3Numbers.length; i++){
            max3Numbers[i] = scanner.nextInt();
            if (max3Numbers[i] > max){
                max = max3Numbers[i];
            }
        }
        System.out.println(max);
    }

    public static void task2(){
        //Задача 2. Сумма чисел от 1 до N
        //=======================
        //Напиши программу, которая вычисляет сумму чисел от 1 до N, где N — число, введённое тобой.

        System.out.print("введите числа: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int summ = 0;
        for (int i = 0; i <= n; i++){
            summ += i;
        }
        System.out.println(summ);
    }

    public static void task3(){
        //Задача 3. Таблица умножения
        //=======================
        //Выведи таблицу умножения для числа, введённого тобой.
        //Например, если ты ввёшь число 2, нужно вывести:
        //2x1=2
        //2x2=4

        System.out.print("введите число для таблицы умножения: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }

    public static void task4(){
        int[] massiv = {10, 11, 43, 45, 64, 22, 12, 6, 4, 17};
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        for (int i = 0; i < massiv.length; i++){
            if (massiv[i] < min){
                min = massiv[i];
                minIndex = i;
            }
        }
        System.out.println("min number: " + min + " + index: " + minIndex);
    }

    public static void task5(){
        int deny = 0; //отрицательный
        int positive = 0; // положительные
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++){
            int n = scanner.nextInt();
            if (n > 0){
                positive += 1;
            } else if (n < 0) {
                deny += 1;
            }
        }
        System.out.println("положительных чисел: " + positive + ", отрицательных: " + deny);


    }
    public static void task6(){
        // школа
        //сначала указать количество кабинетов
        // потом через пробел вводишь имена учеников для каждого кабинета
        // потом спросить имя ученика
        //цель - узнать в каком кабинете он находится


        Scanner scanner = new Scanner(System.in);
        //вводим количество кабинетов
        System.out.println("введите количество кабинетов: ");
        int classRooms = scanner.nextInt();

        //создаем массив длиной указанной сканером
        String [][] school = new String[classRooms][];

        //создаем цикл куда кладем через пробел имена участников
        for (int i = 0; i < school.length; i++){
            System.out.println("введите имена учеников через пробел");
            //через клавиатуру вводим имена
            String line = scanner.nextLine();
            // разделителем слкжит пробел
            school[i] = line.split(" ");
        }

//        for (int i =0; i <school.length; i++){
//            for (int j = 0; j <school[i].length; j++){
//                System.out.print(school[i][j] + " ");
//            }
//        }


        for (int i = 0; i < school.length; i++){
            System.out.println("введите имя ученика для поиска кабинета: ");
            String n = scanner.nextLine();
            for (String name : school[i]){
                if (name.equals(n)){
                    scanner.close();
                    return i;
                }
            }
        }
        System.out.println();
    }
    //{}
    //{}
    //{}
    //{}
    //{}
}
