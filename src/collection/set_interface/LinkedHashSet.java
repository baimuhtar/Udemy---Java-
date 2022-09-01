package collection.set_interface;

public class LinkedHashSet {
    public static void main(String[] args) {
        java.util.LinkedHashSet <Integer> lhs = new java.util.LinkedHashSet<>();
        lhs.add(5);
        lhs.add(3);
        lhs.add(3);
        lhs.add(8);
        lhs.add(10);
        System.out.println(lhs);
        lhs.remove(8);
        System.out.println(lhs);
        System.out.println(lhs.contains(10));

    }
}
