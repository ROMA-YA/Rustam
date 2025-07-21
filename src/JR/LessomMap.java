package JR;

import java.util.Arrays;
import java.util.Scanner;

public class LessomMap {
    public static void main(String[] args) {
      //  Task1();
        Task2();
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
        int[] kraska = new int[5];
        kraska[0] = 10;
        kraska[1] = 20;
        kraska[2] = 30;
        kraska[3] = 40;
        kraska[4] = 50;

        System.out.println(Arrays.toString(kraska));
    }

    //вывести не в одну строку, а каждая с новой строки

}
