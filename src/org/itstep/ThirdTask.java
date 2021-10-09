package org.itstep;

import java.net.MalformedURLException;
import java.net.URL;

public class ThirdTask {
    public static void main(String[] args) throws MalformedURLException {
        //Задача 3. Программа должна обрабатывать все строки, подобные указанным.
        // 3. Из URL извлечь протокол, домен, имя файла и расширение.
        //https://www.computerhope.com/index.html
        String s = "https://www.computerhope.com/index.html";
        System.out.println("Строка подключения: " + s);
        URL url = new URL(s);
        System.out.println("Протокол: " + url.getProtocol());
        System.out.println("Домен: " + url.getHost());
        int s1 = url.getFile().length();
        System.out.println("Имя файла и расширение: " + url.getFile().substring(1,s1));
    }
}
