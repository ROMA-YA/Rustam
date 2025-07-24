package HomeWork;

import java.util.HashMap;
import java.util.Scanner;

public class Phone_Book {
    public static HashMap<String, String> phoneBook = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            showMainMenu();
            System.out.println("Введите действие: ");
            String action = scanner.nextLine();
            switch (action) {
                case "1":
                    addUser(scanner);
                    break;
                case "2":
                    deleteUser(scanner);
                    break;
                case "3":
                    showAllUsers();
                    break;
                case "4":
                    search(scanner);
                    break;
                case "5":
                    return;
            }
        }
    }

    private static void showMainMenu() {
        System.out.println("[1] Добавить контакт");
        System.out.println("[2] Удалить контакт");
        System.out.println("[3] Показать список");
        System.out.println("[4] Поиск");
        System.out.println("[5] Выход");
    }

    public static void addUser(Scanner scanner) {
        System.out.println("введите имя: ");
        String name = scanner.nextLine();
        System.out.println("номер: ");
        String number = scanner.nextLine();

        phoneBook.put(name, number);
    }

    public static void showAllUsers() {
        System.out.println("Контакты: ");
        for (String allUsers : phoneBook.keySet()) {
            System.out.println(allUsers);
        }
    }

    public static void deleteUser(Scanner scanner) {
        System.out.println("введите имя для удаления");
        String delete = scanner.nextLine();
        if (phoneBook.containsKey(delete)) {
            phoneBook.remove(delete);
            System.out.println("контакт удален");
        } else {
            System.out.println("нет контакта");
        }
    }

    public static void search(Scanner scanner) {
        System.out.println("Поиск: ");
        String name = scanner.nextLine();
        if (phoneBook.containsKey(name)) {
            String number = phoneBook.get(name);
            System.out.println("Найденный контакт: " + name + " - " + number);
        } else {
            System.out.println("Контакт не найден");
        }
    }
}
