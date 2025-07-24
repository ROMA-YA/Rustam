package JR;
import java.util.Scanner;

public class Theme3_Lesson5_Temperature {

    public static boolean isHight;
    public static boolean isLow;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double bodyTemperature = scanner.nextDouble();
        isHight = bodyTemperature > 37;
        isLow = bodyTemperature < 36;
        if (isHight) {
            System.out.println("температура тела высокая");
        } else if (isLow){
            System.out.println("температура тела низкая");
        } else {
            System.out.println("температура тела нормальная");
        }
    }
}
