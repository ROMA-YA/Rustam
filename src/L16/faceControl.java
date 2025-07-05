package L16;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class faceControl {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            System.out.print("Введите путь к файлу: ");
            String filePath = scanner.nextLine();

            Path path = Paths.get(filePath);
            List<String> lines = Files.readAllLines(path);

            for (String line : lines){
                for (char ch : line.toCharArray()){
                    if (ch != '.' && ch != ',' && ch != ' '){
                        System.out.println(ch);
                    }
                }
            }
        }catch (IOException e){
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
    }
}
