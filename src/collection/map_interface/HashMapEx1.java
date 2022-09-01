package collection.map_interface;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(1000,"Zaur Tregulov");
        map1.put(3567,"Ivan Ivanov");
        map1.put(885,"Maria Sidorova");
        map1.put(3002,"Nikolay Petrov");
        map1.putIfAbsent(3002,"Oleg Ivanov");// добавь элемент если такого элемента нет

        System.out.println(map1);
        // Никакого порядка ХэшМэп не соблюдает
        // можно добавялть элементы с ключом null
        System.out.println(map1.get(1000)); // выводить элемент по ключу
        map1.remove(3002); //удаляет элементы
        System.out.println(map1.containsValue("Oleg Ivanov")); // есть ли данный элемент?
        System.out.println(map1.containsKey(885)); // Есть ли такой ключ?
        System.out.println(map1.keySet()); // дай мне множество ключей
        System.out.println(map1.values()); // дай мне множество значений

        Map<String, String> map2 = new HashMap<>();
        map2.put("Sasha", "Dobriy");
        map2.put("Misha", "Umnyi");







    }
}
