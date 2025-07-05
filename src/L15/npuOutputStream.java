package L15;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class npuOutputStream {
    public static void main(String[] args) {
            try(Scanner scanner = new Scanner(System.in);
            var inputStream = Files.newInputStream(Paths.get(scanner.nextLine()));
            var outputStream = Files.newOutputStream(Paths.get(scanner.nextLine())))
        {
            byte[] bytesIn = inputStream.readAllBytes();
            for (int i = 0; i < bytesIn.length - 1; i += 2){
                byte temp = bytesIn[i];
                bytesIn[i] = bytesIn[i + 1];
                bytesIn[i + 1] = temp;
            }
            outputStream.write(bytesIn);


        }catch (IOException e){
                System.out.println("Something went wrong : " + e);
            }

    }
}
