package l13;
import java.util.ArrayList;

public class Countries {
    public static void main(String[] args) {
        ArrayList<String> country = new ArrayList<>();
        country.add("китай");
        country.add("монголия");
        country.add("казахстан");
        country.add("франция");
        country.add("италия");

        System.out.println(country);

        country.add(3, "япония");
        country.remove(1);
        System.out.println(country);
    }

}
