package l13;
import java.util.ArrayList;

public class CountriesSize {
    public static void main(String[] args) {
        ArrayList<String> countries = initCountries();
        countri7Size(countries);
    }


    public static ArrayList<String> initCountries(){
        ArrayList<String> countries = new ArrayList<>();
        countries.add("Китай");
        countries.add("Монголия");
        countries.add("Казахстан");
        countries.add("Франция");
        countries.add("Италия");
        countries.add("Канада");
        countries.add("Япония");
        countries.add("Германия");
        countries.add("Португалия");
        countries.add("Турция");
        countries.add("Бразилия");
        countries.add("Швеция");
        countries.add("Норвегия");
        return countries;
    }

    public static void countri7Size(ArrayList<String> countries){
        for (String country : countries){
            if (country.length() == 7){
                System.out.println(country);
            }
        }
    }


}
