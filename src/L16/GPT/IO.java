package L16.GPT;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите путь к файлу");
        String filerPath = scanner.nextLine();

        try(FileWriter fileWriter = new FileWriter(filerPath)) {
            while (true){
                String line = scanner.nextLine();
                if (line.isEmpty()){
                    break;
                }
                fileWriter.write(line + System.lineSeparator());
            }
            System.out.println("Файл успешно записан: " + filerPath);

        }catch (IOException e){
            System.out.println("Ошибка при записи в файл: " + e.getMessage());
        }
    }
}
