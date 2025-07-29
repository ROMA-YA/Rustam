package HomeWork.Massiv;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        int[] number = new int[10];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
        }
        for (int i = 0; i < number.length; i++){
            int summ = 0;
            if (number[i] >= 10){
                summ += summ;

            }else {
                System.out.println("все числа меньше 10");
            }
        }
        //дз

    }
}
