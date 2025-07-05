package L16.GPT;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class Gpt_1 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)){
            System.out.println("введите адрес файла: ");
            String filePath = scanner.nextLine();

            List<String> lines = Files.readAllLines(Path.of(filePath));

            for (String line : lines){
                System.out.println(line);
            }



        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
