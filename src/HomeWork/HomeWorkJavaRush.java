//package HomeWork;
//
//import jdk.internal.access.JavaSecurityAccess;
//
//import java.util.HashMap;
//
//public class HomeWorkJavaRush {
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
//    public static HashMap<Character, Character> encryptMap = new HashMap<>();
//    public static HashMap<Character, Character> decryptMap = new HashMap<>();
//    public static String abc = "абвгдеёжзийклмнопрстуфхцчшщъыьэюя";
//
//    public static void main(String[] args) {
//        addingText(abc);
//        decrypt(abc);
//
//    }
//
//    public static void encrypt(String text){
//
//        for (int i = 0; i < text.length(); i++){
//            JavaSecurityAccess.ProtectionDomainCache alphabet;
//            alphabet.put(text.charAt(i), text.charAt(text.length() - i - 1));
//        }
//
//    }
//    public static void decrypt(String text){
//        for (int i = text.length(); i > 0; i--){
//            alphabet.put(text.charAt(i), text.charAt(text.length() + i));
//        }
//    }
//
//    public static void addingText(String text){
//        for (int i = 0; i < text.length(); i++){
//            System.out.println(text.charAt(i) + " - " + text.charAt(text.length() - i - 1));
//        }
//
//    }
//
//}
