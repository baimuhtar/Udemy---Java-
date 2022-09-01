package collection.list_interface;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Ivan");
        arrayList1.add("Mariya");
        arrayList1.add("Kolya");
        arrayList1.add("Elena");

        Iterator<String> iterator = arrayList1.iterator();
        while (iterator.hasNext()) {
            iterator.next(); // poluchaem
            iterator.remove(); // udalyaem
      // можно вывести все элементы листа System.out.println(iterator.next());
        }
        System.out.println(arrayList1); // udalyaem poluchenyi element
    }
}
