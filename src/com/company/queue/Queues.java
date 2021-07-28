package com.company.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
//        Queue<String> names = new LinkedList<>();
//        Queue<String> people = new LinkedList<>();
//        names.offer("Josh");
//        names.offer("Marry");
//        names.offer("David");
//        names.offer("George");
//        System.out.println(names.element());
//        System.out.println(people.peek());
//
//        names.remove();
//        names.poll();

        Deque<String> names  = new ArrayDeque<>();
        names.addFirst("Josh");
        names.add("Marry");
        names.addLast("David");
        System.out.println(names.remove());

    }
}
