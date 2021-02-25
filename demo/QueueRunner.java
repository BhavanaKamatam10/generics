package demo;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class StringLengthComparator implements Comparator<String> {

    @Override
    public int compare(String value1, String value2) {
        return Integer.compare(value2.length(), value1 .length());
    }
}

public class QueueRunner{
    public static void main(String[] args) {
        Queue<String> queue = new PriorityQueue<>(new StringLengthComparator());
        queue.addAll(List.of("Zebra", "Cat", "Monkey"));
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }

}
