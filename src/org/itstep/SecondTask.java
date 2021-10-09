package org.itstep;

public class SecondTask {
    public static void main(String[] args) {
        // Задача 2.
        // 3.Дано предложение. Заменить в нем все вхождения буквосочетания ах на ух.
        String s = "Заменить в нем все вхождения буквосочетания ах на ух.";
        System.out.println("Дано предложение: " + s);
        String result = s.replace("ах","ух");
        System.out.println("Итоговое предложение: " + result);
    }
}
