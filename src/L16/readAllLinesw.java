package L16;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

public class readAllLinesw {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            List<String> Lines = Files.readAllLines(Path.of(scanner.nextLine()));

            for (int i = 0; i < Lines.size(); i += 2){
                System.out.println(Lines.get(i));
            }
        }catch (IOException e){
            System.out.println(e);
        }
    }
}
