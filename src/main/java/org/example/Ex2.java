package org.example;

import java.util.HashMap;

public class Ex2 {
    public static void main(String[] args) {
        // Создаем первое множество
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("ключ1", "значение1");
        map1.put("ключ2", "значение2");
        map1.put("ключ3", "значение3");

        // Создаем второе множество
        HashMap<String, String> map2 = new HashMap<>();
        map2.put("ключ2", "новое значение2");
        map2.put("ключ4", "значение4");
        map2.put("ключ5", "значение5");

        // Объединяем значения в обоих множествах, если ключи совпадают
        for (String key : map2.keySet()) {
            if (map1.containsKey(key)) {
                String value1 = map1.get(key);
                String value2 = map2.get(key);
                String newValue = value1 + " " + value2;
                map1.put(key, newValue);
            } else {
                map1.put(key, map2.get(key));
            }
        }

        // Выводим результат в консоль
        for (String key : map1.keySet()) {
            System.out.println(key + ": " + map1.get(key));
        }
    }
}
