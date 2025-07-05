package L15;
import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

public class IOExtention16_05_2025 {
    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        }catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }catch (FileSystemException e){
            throw new RuntimeException(e);
        }

        //напишите тут ваш код
    }
}
