package collection.list_interface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMethods5 {
    public static void main(String[] args) {

        ArrayList<String> arrayList1 = new ArrayList<>();
        arrayList1.add("Zaur");
        arrayList1.add("Dima");
        arrayList1.add("Maria");
        arrayList1.add("Elena");

        List<Integer> list1 = List.of(3, 8, 13); // null soderjat ne mojet
        System.out.println(list1);
        //list1.add(100);

        List<String> list2 = List.copyOf(arrayList1);
        System.out.println(list2);
//        Object [] array = arrayList1.toArray();
//        String [] array2 = arrayList1.toArray(new String[0]);
//
//        for (String s : array2 ) {
//            System.out.println(s); // vivod elementov

//        List<String> myList = arrayList1.subList(1,3); // Взять часть элементов с ... по ...
//        System.out.println(myList);
//        myList.add("Fedr");
//        System.out.println(myList);
//        System.out.println(arrayList1); // он добавляется в оба листа сразу

//        ArrayList<String> arrayList2 = new ArrayList<>();
//        arrayList2.add("Dima");
//        arrayList2.add("Zaur");
//        arrayList2.add("Lev");
//        arrayList1.removeAll(arrayList2); Удаляет одинаковые элементы с одного листа
//        System.out.println(arrayList1);
//        arrayList1.retainAll(arrayList2);

//        boolean result = arrayList1.containsAll(arrayList2); // содержит ли первый лист все элементы другого листа
//        System.out.println(result);

    }
}