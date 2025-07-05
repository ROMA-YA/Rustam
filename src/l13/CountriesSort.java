package l13;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CountriesSort {
    public static void main(String[] args) {
        ArrayList<String> initCountries = initCountries();
        countrySortes(initCountries);
        toUpperCase(initCountries);
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

    public static void countrySortes(ArrayList<String> country){
        Collections.sort(country);

        for (String sortes : country){
            System.out.println(sortes);
        }
    }

    public static void toUpperCase(ArrayList<String> country){
        for (int i =0; i < country.size(); i++){
            country.set(i, country.get(i).toUpperCase());
        }
        System.out.println(country);
    }
}
