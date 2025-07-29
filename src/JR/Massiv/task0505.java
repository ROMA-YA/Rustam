package JR.Massiv;

import java.util.Scanner;

public class task0505 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] number = new int[n];
        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
        }
        if (n % 2 == 0){
            int i;
            for (i = number.length - 1; i >= 0; i--){
                System.out.print(number[i] + " ");
            }
        }else {
            for (int i = 0; i < number.length; i++){
                System.out.print(number[i] + " ");
            }
        }
    }
}
