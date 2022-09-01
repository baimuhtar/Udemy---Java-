package collection.map_interface;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov", 3);
        Student st2 = new Student("Mariya", "Ivanova", 1);
        Student st3 = new Student("Sergey", "Petrov", 4);
        Student st4 = new Student("Igor", "Sidorov", 2);
        Student st5 = new Student("Vasilliy", "Smirnov", 1);
        Student st6 = new Student("Sasha", "Kapustin", 3);
        Student st7 = new Student("Elena", "Sidorova", 4);
        treeMap.put(5.8,st7); // Если поменять местами V то нужно имплементировть класс Comparable
        treeMap.put(6.4,st2);
        treeMap.put(7.2,st1);
        treeMap.put(7.5,st4);
        treeMap.put(8.2,st3);
        treeMap.put(7.9,st6);
        treeMap.put(9.1,st5);


        System.out.println(treeMap);
        System.out.println(treeMap.tailMap(5.8));
        System.out.println(treeMap.headMap(7.5));
        System.out.println(treeMap.lastEntry());
        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.get(6.4));
//        treeMap.remove(5.8);
//       System.out.println(treeMap.descendingMap());

    }
}