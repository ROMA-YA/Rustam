package l14;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Iteratorrr {
    public static void print(HashSet<String> words){
        Iterator<String> iterator = words.iterator();
            while (iterator.hasNext()){
                String str = iterator.next();
                System.out.println(str);
            }
    }

    public static void main(String[] args) {
        HashSet<String> words = new HashSet<>(Arrays.asList("Программированию обычно учат на примерах.".split(" ")));
        print(words);
    }
}
