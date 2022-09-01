package scanner;

import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
       // Scanner scanner = new Scanner(System.in);
      /*  System.out.println("Vvedite chislo");
        int i = scanner.nextInt();
        System.out.println("Vvedennoe chislo: " + i);*/

        /*System.out.println("Napishite 2 chisla");
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        System.out.println("Chastnoe = " + x/y);
        System.out.println("Ostatok = " + x%y);*/

        /*System.out.println("Napishite 2 stroki");
        String s1 = scanner.nextLine();
        String s2 = scanner.next();
        System.out.println("Vi napisali v 1 stroke: " + s1);
        System.out.println("Vi napisali vo 2 stroke: " + s2);*/

        /*System.out.println("Vvedite drobnoe chislo");
        double d = scanner.nextDouble();
        System.out.println("Vvedennoe chislo " + d);*/

        /*Scanner scanner = new Scanner("Privet Moi drug");*/
        Scanner scanner = new Scanner("Privet Moi drug!\n Kak pozhivaesh?" +
                "\nChto horoshego?");
       /* String s = scanner.nextLine();
        System.out.println(s);
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());
        System.out.println(scanner.nextLine());*/

        /*while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }*/
        System.out.println(scanner.next().charAt(2));
    }
}
