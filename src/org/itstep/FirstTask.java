package org.itstep;

public class FirstTask {
    static String [] arrString = {"актрисса","бариста"};
    static String s = "абстракция";
    public static void main(String[] args) {
        // Задача 1. Из исходного слова путем «вырезок» и «склеек» его подстрок получить другие слова:
        // 3. абстракция: актрисса, бариста.
        System.out.println("Исходное слово: " + s);
        for (String s1 : arrString) {
            int  lengthWord = s1.length();
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < lengthWord; i++) {
                int pos = s.indexOf(s1.charAt(i));
                result.append(s.charAt(pos));
            }
            System.out.println("Слово - образец: " + s1 + "; получено путем «вырезок» и «склеек»: " + result);
        }
    }
}
