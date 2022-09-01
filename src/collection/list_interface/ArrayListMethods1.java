package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        ArrayList <String> arrayList1 = new ArrayList();
        arrayList1.add("Zaur");
        arrayList1.add("Dima");
        arrayList1.add("Maria");
        arrayList1.add(2,"Ivan");
        for (String s : arrayList1) {
            System.out.println(s + " ");
        }
//        System.out.println();
//        ArrayList <Integer> arrayList2 = new ArrayList<>();
//        arrayList2.add(2);

        System.out.println(arrayList1.get(2)); // получить элекмент на индексе

        arrayList1.set(1,"Masha"); // установить элемент на индекс
        System.out.println(arrayList1);

        arrayList1.remove(0); // удаление элекмента
        System.out.println(arrayList1);
    }
}
