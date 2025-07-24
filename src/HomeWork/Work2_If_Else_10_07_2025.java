package HomeWork;

import java.util.Scanner;

public class Work2_If_Else_10_07_2025 {
//ЛИМОН - ЖЕЛТЫЙ, КРУГЛЫЙ, ВЕСИТ МЕНЬШЕ 1 КГ
//МЯЧ - ЖЕЛТЫЙ, КРУГЛЫЙ, ВЕСИТ БОЛЬШЕ 1 КГ
//КОРОБКА - ЖЕЛТАЯ, КВАДРАТНАЯ
//ЛАЙМ - ЗЕЛЕНЫЙ, КРУГЛЫЙ, ВЕСИТ МЕНЬШЕ 1 КГ
//СПОРТИВНАЯ СУМКА - ЗЕЛЕНАЯ, КВАДРАТНАЯ, ВЕСИТ БОЛЬШЕ 1 КГ
//небо - синий, сразу вывести

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цвет: ");
        String color = scanner.nextLine();

        System.out.println("Введите форму: ");
        String form = scanner.nextLine();


        System.out.println("Введите вес: ");
        int weight = scanner.nextInt();

        if (color.equalsIgnoreCase("ЖЕЛТЫЙ") && form.equalsIgnoreCase("КРУГЛЫЙ")){
           if (weight < 1){
               System.out.println("ЛИМОН");
           } else if (weight > 1) {
               System.out.println("МЯЧ");
           }
        }

        else if (color.equalsIgnoreCase("ЗЕЛЕНЫЙ") && weight > 1){
            if (form.equalsIgnoreCase("КРУГЛЫЙ")){
                System.out.println("ЛАЙМ");
            } else if (form.equalsIgnoreCase("КВАДРАТНАЯ")) {
                System.out.println("СПОРТИВНАЯ СУМКА");
            }
        }
        else if (color.equalsIgnoreCase("ЖЕЛТЫЙ") && form.equalsIgnoreCase("КВАДРАТНАЯ")){
            System.out.println("КОРОБКА");
        }


    }
}
