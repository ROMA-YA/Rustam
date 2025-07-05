package L16.GPT;

import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Gpt_2 {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.println("введите путь к файлу: ");
            String pathFile = scanner.nextLine();

            // 1. Читаем строки из файла
            ArrayList<String> lines = new ArrayList<>(Files.readAllLines(Path.of(pathFile)));

            while (true){
                String input = scanner.nextLine();
                if (input.isEmpty()) break;
                lines.add(input);
            }

            Files.write(Path.of(pathFile), lines);

            System.out.println("файл обновлен");


        }catch (IOException e){
            System.out.println("Ошибка при работе с файлом: " + e.getMessage());
        }
    }
}
