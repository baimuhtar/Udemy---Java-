package lambda;

public class Test2 {
   static void def (I i) {
    System.out.println(i.abc("privet"));
}

    public static void main(String[] args) {
       final int i = 10; // его можно использовать
        def((String s) -> {
            System.out.println(i);
            return  s.length();
        });
        System.out.println();
    }
}
interface I {
    int abc (String s);
}