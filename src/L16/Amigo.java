package L16;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;



public class Amigo {
    public static void main(String[] args) throws IOException {

        if (args.length == 0){
            System.out.println("Передайте текст в аргументах командной строки");
            return;
        }
        byte[] bytes = args[0].getBytes(); // получаем байты из текста
        Scanner scanner = new Scanner(System.in); // ← берём ввод с клавиатуры
        System.out.print("Введите путь к файлу для записи: ");
        String filePath = scanner.nextLine();

        Files.write(Path.of(filePath), bytes); // записываем в указанный файл

        System.out.println("Данные успешно записаны в файл: " + filePath);

    }
}
