package HomeWork.Massiv;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите длину массива: ");
        int n = scanner.nextInt();

        int[] summArray = new int[n];
        int summAllNumbers = 0;
        for (int i = 0; i < summArray.length; i++){
            summArray[i] = scanner.nextInt();
            summAllNumbers += summArray[i];
        }
        System.out.println(summArray);
        System.out.println();
        System.out.println(summAllNumbers);

        //дз
    }
}
