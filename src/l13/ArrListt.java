package l13;

import java.util.ArrayList;
import java.util.List;

public class ArrListt {

    public static List<String> waitingEmployees = new ArrayList<>();
    public static ArrayList<String> alreadyGotSalaryEmployees = new ArrayList<>();


    public static void initEmployees(){
        waitingEmployees.add("Гвинно");
        waitingEmployees.add("Гунигерд");
        waitingEmployees.add("Боргелейф");
        waitingEmployees.add("Нифрод");
        waitingEmployees.add("Альбиуф");
        waitingEmployees.add("Иногрим");
        waitingEmployees.add("Фриле");
    }
    public static void main(String[] args) {
        initEmployees();
        paySalary("Гвинно");

        System.out.println("waitingEmployees: " + waitingEmployees);
        System.out.println("alreadyGotSalaryEmployees: " + alreadyGotSalaryEmployees);
    }

    public static void paySalary(String name){
        if (name == null){
            return;
        }
        for (int i = 0; i < waitingEmployees.size(); i++){
            if (name.equals(waitingEmployees.get(i))){
                alreadyGotSalaryEmployees.add(name);
                waitingEmployees.set(i, null);
                break;
            }
        }
    }
}
