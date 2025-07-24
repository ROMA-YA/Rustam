package JR;

import java.util.Scanner;

public class VvodChiselReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("введите длину строки: ");
        int number = scanner.nextInt();


        int[] ArrayNumber = new int[number];
        for (int i = 0; i < number; i++){
            ArrayNumber[i] = scanner.nextInt();
        }
/*
        if (number % 2 == 0){
            for (int i = ArrayNumber.length; i >= 0; i--){
                System.out.println(ArrayNumber[i]);
            }
        }else {
            for (int i = 0; i < ArrayNumber.length; i++){
                System.out.println(ArrayNumber[i]);
            }
        }
 */
        int min = ArrayNumber[0];
        for (int i = 0; i < number; i++){
            if (ArrayNumber[i] < min){
                min = ArrayNumber[i];
            }
        }
        System.out.println(min);
    }
}
