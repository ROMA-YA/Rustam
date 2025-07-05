package l14;

import java.util.Date;
import java.util.HashMap;

public class Mapp {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        printStudent();
        System.out.println("-------------------");

        Double bulls = getAverageMark();
        System.out.println("Средний балл = " + getAverageMark());
        System.out.println("-------------------");

        printStudentsInfo();
    }
    public static void addStudents(){
        grades.put("Давыдов Олег", 4.3d);
        grades.put("Шульга Николай", 4.1d);
        grades.put("Колос Василий", 4.9d);
        grades.put("Шевченко Тарас", 3.7d);
        grades.put("Марчук Любослав", 3.2d);
    }

    public static void printStudent(){
        for (String key: grades.keySet()){
            Double value = grades.get(key);
            System.out.println(key + " --> " + value);
        }
    }

    public static Double getAverageMark() {
        Double sum = 0.0d;
        for (Double mark : grades.values()){
            sum += mark;
        }
        if (grades.isEmpty()){
            return 0.0;
        }
        return sum / grades.size();

    }
    public static void printStudentsInfo() {
        for (var allInfoForStudent : grades.entrySet()){
            String key = allInfoForStudent.getKey();
            Double value = allInfoForStudent.getValue();
            System.out.println(key + " --> " + value);
        }
    }




}
