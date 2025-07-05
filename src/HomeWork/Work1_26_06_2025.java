package HomeWork;

import java.util.*;

public class Work1_26_06_2025 {
    public static void main(String[] args) {

        task1();
        task2();
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

        //вывод количества всех символов в
        var simbol = text.length();
        System.out.println(simbol);

        HashSet<Character> differentSymbols = new HashSet<>();

        for(char c : text.toCharArray()){
            differentSymbols.add(c);
        }

        System.out.println("количества разных символов в тексте " + differentSymbols.size());
        System.out.println("Уникальные символы: " + differentSymbols);



    }

    public static void task1_1(){

    }

    // === Школьный дневник ===
    /*
        Запускается приложение:

        Шаг 1.
        Система просит ввести имя ученика, учитель вводит имя

        Шаг 2.
        На следующей строке система отображает текущие оценки (если они есть) указанного ученика,
        а если в системе у этого ученика нет оценок, то выводит текст "Нет оценок"

        Шаг 3.
        На следующей строке учитель начинает вводить оценки через пробел, нажимает Enter и оценки добавляются в систему

        Шаг 4.
        Переход к шагу 1
     */
    private static void task2() {
        Scanner scanner = new Scanner(System.in);

        // для хранения имен и оценок
        HashMap<String, List<Integer>> nameAndGrades = new HashMap<>();



        while (true){
            // ввод имени
            System.out.println("введите имя ученика: ");
            String name = scanner.nextLine();
            if (name.isEmpty()){
                break;
            }
            // ввод оценок
            System.out.println("введите оценки: ");
            String gradesLine = scanner.nextLine();

            // разделяем строки пробелом
            String[] gradesArray = gradesLine.split(" ");

            // создаем массив из оценок
            List<Integer> grades = new ArrayList<>();

            // перебор всех элементов массива
            for (int i = 0; i < gradesArray.length; i ++){
                // сохраняем каждое значение отдельно
                String gradeStr = gradesArray[i];
                // преобразуем string в Int
                int gradeInt = Integer.parseInt(gradeStr);
                grades.add(gradeInt);
            }

            nameAndGrades.put(name, grades);
        }
    }
}
//git remote add origin https://github.com/ROMA-YA/Rustam.git
//git branch -M main
//git push -u origin main
