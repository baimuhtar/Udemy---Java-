package collection.set_interface;

import java.util.HashSet;

public class HashSetEx2 {
    public static void main(String[] args) {

        HashSet<Integer> hashSet1 = new HashSet<>();
        hashSet1.add(2);
        hashSet1.add(3);
        hashSet1.add(5);
        hashSet1.add(8);
        hashSet1.add(1);

        HashSet<Integer> hashSet2 = new HashSet<>();
        hashSet2.add(7);
        hashSet2.add(4);
        hashSet2.add(5);
        hashSet2.add(3);
        hashSet2.add(8);

        HashSet<Integer> union = new HashSet<>(hashSet1); // union
        HashSet<Integer> intersect = new HashSet<>(hashSet1);// intersect
        HashSet<Integer> subtract = new HashSet<>(hashSet1); //subtract

        union.addAll(hashSet2);
        System.out.println(union); // объединить

        intersect.retainAll(hashSet2);
        System.out.println(intersect); // найти пересечение

        subtract.removeAll(hashSet2);
        System.out.println(subtract); // от первой части удалить вторую или наоборот

    }
}
