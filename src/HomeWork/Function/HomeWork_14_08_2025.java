package HomeWork.Function;

import java.util.Arrays;
import java.util.Scanner;

public class HomeWork_14_08_2025 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите числа для совершения математической операции: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        addition(a, b);
        subtraction(a, b);
        multiplication(a, b);
        division(a, b);


        int[] array = new int[5];
        massiv(array);


    }

    public static void addition(int a, int b){
        System.out.println(a + b);
    }
    public static void subtraction(int a, int b){
        System.out.println(a - b);
    }
    public static void multiplication(int a, int b){
        System.out.println(a * b);
    }
    public static void division(int a, int b){
        System.out.println(a / b);
    }

    public static void massiv(int[] array){
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < array.length; i++){
            array[i] = scanner.nextInt();
        }
        Arrays.sort(array);
        for (int arr : array){
            System.out.println(arr + " ");
        }
    }
}

//subtraction
//multiplication
//division