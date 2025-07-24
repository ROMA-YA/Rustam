package JR;

import java.util.Arrays;
import java.util.Scanner;

public class LessomMap {
    public static void main(String[] args) {
      //  Task1()
      // Task2();
      // Task3();
        Task4();
    }
    public static void Task1(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите количество краски: ");
        int kraska = scanner.nextInt();
        if (kraska > 100){
            System.out.println("Хватит на покраску");
        } else if (kraska < 100) {
            System.out.println("Недостаточно краски");
        }else {
            System.out.println("Закрасит ровно");
        }
    }

    public static void Task2(){
        int[] kraska = {10, 20, 30, 40, 50};
        for (int value : kraska){
            System.out.print(value + ", ");
        }
        System.out.println();
    }

    //вывести не в одну строку, а каждая с новой строки

    public static void Task3(){
        int[] kraska = {10, 20, 30, 40, 50};
        int i = 0;
        while (i < kraska.length){
            System.out.println(kraska[i] + ", ");
            i++;
        }
    }
    public static void Task4(){
        int[] kraska = {100, 250, 150, 50};
        int sum = 0;
        for (int value : kraska){
            sum += value;
        }
        System.out.println(sum);
    }

}
