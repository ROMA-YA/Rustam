package JR.Massiv;

import java.util.Scanner;

public class task0506 {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        array = new int[n];
        for (int i = 0; i < n; i++){
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < n; i++){
            if (array[i] < min){
                min = array[i];
            }
        }
        System.out.println(min);
    }
}
