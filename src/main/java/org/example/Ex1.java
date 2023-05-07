package org.example;

import java.util.HashMap;

public class Ex1 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();

        // Добавляем шесть элементов в множество
        map.put("ключ1", "значение1");
        map.put("ключ2", "значение2");
        map.put("ключ3", "значение3");
        map.put("ключ4", "значение4");
        map.put("ключ5", "значение5");
        map.put("ключ6", "значение6");

        // Выводим значения в консоль
        for (String value : map.values()) {
            System.out.println(value);
        }

        // Добавляем символ "!" к каждому значению
        for (String key : map.keySet()) {
            String value = map.get(key) + "!";
            map.put(key, value);
        }

        // Выводим обновленные значения в консоль
        for (String value : map.values()) {
            System.out.println(value);
        }
    }
}