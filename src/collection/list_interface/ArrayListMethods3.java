package collection.list_interface;

import java.util.ArrayList;

public class ArrayListMethods3 {
    public static void main(String[] args) {
        ArrayList<String> arrayList1 = new ArrayList();
        arrayList1.add("Zaur");
        arrayList1.add("Dima");
        arrayList1.add("Maria");
        arrayList1.add("Dima");
        System.out.println(arrayList1);
        System.out.println(arrayList1.lastIndexOf(1));

        ArrayList<String> arrayList2 = new ArrayList();
        arrayList2.add("!!!");
        arrayList2.add("???");
        arrayList1.addAll(1,arrayList2); // Добавление всех элементов с одного листа в другой
        System.out.println(arrayList1);

       // arrayList1.clear();
        System.out.println(arrayList1);

        System.out.println(arrayList1.size()); // Размер листа
        System.out.println(arrayList1.isEmpty()); // пуст ли он?
        System.out.println(arrayList1.contains("Dima")); // содержит ли данный элемент?
        System.out.println(arrayList1.toString());


    }
}
