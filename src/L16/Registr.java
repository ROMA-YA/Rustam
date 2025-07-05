package L16;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Registr {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(System.in)) {
            String line = scanner.nextLine();
            char[] chars = line.toCharArray();
            for (int i = 0; i < chars.length; i++){
                if (i % 2 == 1){
                    System.out.print(Character.toUpperCase(chars[i]));
                }else {
                    System.out.print(Character.toLowerCase(chars[i]));
                }
            }

        }catch (Exception e){
            System.out.println("Something went wrong : " + e);
        }
    }
}
