package l14;
import java.util.Arrays;
import java.util.HashSet;

import static java.util.Arrays.asList;

public class HashSet1Lesson {
    public static HashSet<String> words = new HashSet<>(asList("Если бы меня попросили выбрать язык на замену Java я бы не выбирал".split(" ")));

    public static void checkWords(String word){
        if (words.contains(word)){
            System.out.println(String.format("слово %s есть в множестве", word));
        }
        else  {
            System.out.println(String.format("слово %s нет в множестве", word));
        }
    }

    public static void main(String[] args) {
        checkWords("JavaScript");
        checkWords("Java");
    }

}
