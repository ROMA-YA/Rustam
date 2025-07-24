package HomeWork;

import java.util.HashMap;

public class HomeWorkJavaRush {
    /*
    Используя HashMap, создай систему шифрования и дешифрования.

        Создай 2 метода
        String encrypt(String text) - для шифрования
        String decrypt(String text) - для дешифрования

        Напиши код внутри каждого из них.

        Система:
        А-Я
        Б-Ю
        В-Э



        …

        Например при шифровании все буквы А меняются на Я, все буквы Б меняются на Ю и так далее.
        А при дешифровании меняются наоборот (Я на А, и т д)
     */
    public static HashMap<String, String> alphabet = new HashMap<>();
        public static String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";

    public static void main(String[] args) {
        encrypt(abc);

    }

    public static void encrypt(String text){

        //        for (int i = 0; i < text.length(); i++){
//            System.out.println(text.charAt(i) + " ");
//        }
        System.out.println(text.charAt(0) + " " + text.charAt(text.length() - 1));
        System.out.println(text.charAt(1) + " " + text.charAt(text.length() - 2));
        System.out.println(text.charAt(2) + " " + text.charAt(text.length() - 3));
        for (int i = 0; i < text.length(); i++){
            System.out.println(text.charAt(i) + " - " + (text.length() - i - 1));

        }

    }
    public static void decrypt(String text){

    }

}
