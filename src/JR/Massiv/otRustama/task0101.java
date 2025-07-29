package JR.Massiv.otRustama;

import java.util.Arrays;
import java.util.Scanner;

public class task0101 {

    public static void main(String[] args) {

        String[] names = new String[]{"Превышение-10",
                "Парковка на тротуаре",
                "Непристегнутый ремень",
                "Превышение-30",
                "Тонировка запрещенная",
                "Проезд на красный",
                "Вождение без прав",
                "Алкогольное опьянение",
                "Скорость +60 км/ч",
                "Сбил пешехода"};


        String[] fine = new String[]{
                "Штраф: 500 руб.",
                "Штраф: 1000 руб.",
                "Штраф: 1500 руб.",
                "Штраф: 2500 руб.",
                "Штраф: 3500 руб.",
                "Штраф: 5000 руб.",
                "Штраф: 15000 руб.",
                "Штраф: 30000 руб.",
                "Штраф: 20000 руб.",
                "Штраф: 50000 руб."};

         //вывести список из названий штрафров - пронумеровать их
        // пользователь вводит номер штрафа и выводит
        // текст "за "название штрафа" предусмотрен штраф 500р"

        for (int i = 0; i < names.length; i++){

            System.out.println( i + 1 + " " + names[i]);
        }

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        //input = 1 -> i = 0;
        //input = 2 -> i = 1;
        //input = 3 -> i = 2;
        for (int i = 0; i < names.length; i++){

            // input = 1, i = 0;
            if (String.valueOf(i + 1).equals(input)){

                System.out.println( names[i] + " " + fine[i]);
            }
        }
    }
}
