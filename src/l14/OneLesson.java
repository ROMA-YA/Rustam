package l14;
import java.util.HashSet;

public class OneLesson {
    public static void main(String[] args) {
        String[] array = {"Через", "три", "года", "я", "буду", "Senior", "Java", "Developer"};
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet = arrayToHashSet(array);
        for (String s: hashSet){
            System.out.println(s);
        }
        System.out.println("___________________________________");

        HashSet<String> hashSet1 = arrayToHashSet(array);
        for (String ss: hashSet1){
            System.out.println(ss);
        }
    }

    public static HashSet<String> arrayToHashSet(String[] strings){
        HashSet<String> hashSet = new HashSet<>();
        for (int i =0; i < strings.length; i++){
            hashSet.add(strings[i]);
        }
        return hashSet;
    }
}
