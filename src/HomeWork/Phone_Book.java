package HomeWork;

import java.util.HashMap;
import java.util.Scanner;

public class Phone_Book {
    public static HashMap<String, String> phoneBook = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        addUser(scanner);
        deleteUser(scanner);
        receivingUser(scanner);

    }
    public static void addUser(Scanner scanner){
        System.out.println("введите имя: ");
        String name = scanner.nextLine();
        System.out.println("номер: ");
        String number = scanner.nextLine();

        phoneBook.put(name, number);
        for (String allUsers : phoneBook.keySet()){
            System.out.println(allUsers);
        }

    }
    public static void deleteUser(Scanner scanner){
        System.out.println("введите имя для удаления");
        String delete = scanner.nextLine();
        if (phoneBook.containsKey(delete)){
            phoneBook.remove(delete);
            System.out.println("контакт удален");
        }else{
            System.out.println("нет контакта");
        }

    }
    public static void receivingUser(Scanner scanner){
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)){
            String number = phoneBook.get(name);
            System.out.println("контакт: " + name + " - " + number);
        }
    }


}
