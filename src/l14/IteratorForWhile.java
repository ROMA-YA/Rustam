package l14;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorForWhile {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello world!");
        words.add("Amigo");
        words.add("Elly");
        words.add("Kerry");
        words.add("Bug");
        words.add("bug");
        words.add("Easy ug");
        words.add("Risha");

        ArrayList<String> copyWordsFirst = new ArrayList<>(words);
        ArrayList<String> copyWordsSecond = new ArrayList<>(words);
        ArrayList<String> copyWordsThird = new ArrayList<>(words);



    }

    public static void removeBugWithFor(ArrayList<String> list){
        for (int i = list.size() - 1; i >= 0; i--){
            if (list.get(i).equalsIgnoreCase("bug")){
                list.remove(i);
            }
        }
    }

    public static void removeBugWithWhile(ArrayList<String> list){
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String word = iterator.next();
            if (word.equalsIgnoreCase("bug")){
                iterator.remove();
            }
        }
    }

    public static void removeBugWithCopy(ArrayList<String> list){
        ArrayList<String> copy = new ArrayList<>(list);
        for (String word: copy){
            if (word.equalsIgnoreCase("bug")){
                list.remove(word);
            }
        }
    }
}
