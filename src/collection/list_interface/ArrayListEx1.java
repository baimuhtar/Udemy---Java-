package collection.list_interface;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ArrayListEx1 {
    public static void main(String[] args) {
        // первый вариант создания массива
        ArrayList arrayList1 = new ArrayList();
        arrayList1.add("Zaur");
        arrayList1.add("Dima");
        arrayList1.add("Maria");
        arrayList1.add(7);

        System.out.println(arrayList1);
        // второй вариант создания массива
        ArrayList<String> arrayList2 = new ArrayList<>(200);

        // третий вариант создания массива
        List <String> arrayList3 = new ArrayList<>();

        // четвертый вариант создания массива
        ArrayList<String> arrayList4 = new ArrayList<>(arrayList1);




    }

}
