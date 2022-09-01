package collection.queue_interface;

import java.util.LinkedList;
import java.util.Queue;

public class LinkedListEx {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();
        queue.add("Zaur");
        queue.add("Oleg");
        queue.add("Ivan");
        queue.add("Mariya");
        queue.add("Aleksandr");
        // queue.offer("Name"); При добавлении нового человека в ограниченной очереди с offer не будет выходить exception
        //c add будет выходить exception
        System.out.println(queue);
        System.out.println(queue.remove()); // удаляется element с начала (но с исключением)
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.poll()); // удаляется без появления исключения
        System.out.println(queue.element()); // после удаления показывает кто в очереди встал на первое место(но с исключением)
        System.out.println(queue.peek()); // покажет кто на первом месте без выброса исключения


    }
}
