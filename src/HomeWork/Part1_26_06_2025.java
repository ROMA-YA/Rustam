package HomeWork;
import java.util.HashMap;

public class Part1_26_06_2025 {


    public class Solution {
        public static void main(String[] args) {
            task1();
        }

        // === Статистика символов ===
    /*
     Подсчет количества разных символов в тексте
     */
        private static void task1() {
            String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut " +
                    "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut" +
                    " aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum " +
                    "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia" +
                    " deserunt mollit anim id est laborum.";

            HashMap<Character, Integer> hashMap = new HashMap<>();

            for(char character : text.toCharArray()) {
                int counter = 0;
                if (hashMap.containsKey(character)) {
                    counter = hashMap.get(character);
                }
                counter = counter + 1;
                hashMap.put(character, counter);
            }

            System.out.println(hashMap);
        }

        private static void task2() {

        }
    }
}
