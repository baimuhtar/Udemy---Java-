package nested_classes.anonymous_class;

public class AnonymousClass {
    private int x = 5; // есть доступ к приватным переменным
    public static void main(String[] args) {
        Math m = new Math() {
            int c = 10; // это можно писать
            void abc () {} // это тоже можно писать

            @Override
            public int doOperation (int a, int b) {
                AnonymousClass ac = new AnonymousClass();
                return a+b + ac.x;
            }
        };
        Math m2 = new Math() {
            int c = 10; // это можно писать
            void abc () {} // это тоже можно писать
            @Override
            public int doOperation (int a, int b) {
                return a*b;
            }
        };
        System.out.println(m.doOperation(3,6));
        System.out.println(m2.doOperation(3,6));

    }
}
interface Math {
    int doOperation(int a, int b);
}
