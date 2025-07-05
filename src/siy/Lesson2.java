package siy;

import java.util.ArrayList;
import java.util.Scanner;

public class Lesson2 {
    public static void main(String[] args) {
        ArrayList<String>  name = new ArrayList<>();
        name.add("ivan");
        name.add("Albert");
        name.add("Jonatan");
        name.add("Mari");
        name.add("Andrei");
        name.add("Rustam");
        name.add("Aleksei");
        name.add("Kiril");
        name.add("Ramazan");
        name.add("Rori");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя: ");
        String getName = scanner.nextLine();

        for ( int i = 0; i < name.size(); i ++){
            if (name.get(i).equalsIgnoreCase(getName)){
                continue;
            }
            System.out.println(name.get(i));

        }


    }


}
