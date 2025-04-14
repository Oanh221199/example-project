package com.company;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class CollectionDemo {

    private static final int N = 1000000;

    public static void main(String[] args) {
        testArrayList();
        testLinkedList();
        testHashMap();
        testHashSet();
        testQueue();
        testStack();
    }

    private static void testArrayList() {
        System.out.println("\n--- ArrayList ---");
        List<Integer> list = new ArrayList<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) list.add(i);
        printTime("Add", start);

        start = System.nanoTime();
        int x = list.get(N / 2); // truy cập giữa
        printTime("Get (middle index)", start);

        start = System.nanoTime();
        list.remove(N / 2); // xóa giữa
        printTime("Remove (middle index)", start);
    }

    private static void testLinkedList() {
        System.out.println("\n--- LinkedList ---");
        List<Integer> list = new LinkedList<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) list.add(i);
        printTime("Add", start);

        start = System.nanoTime();
        int x = list.get(N / 2); // truy cập giữa
        printTime("Get (middle index)", start);

        start = System.nanoTime();
        list.remove(N / 2); // xóa giữa
        printTime("Remove (middle index)", start);
    }

    private static void testHashMap() {
        System.out.println("\n--- HashMap ---");
        Map<Integer, String> map = new HashMap<Integer, String>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) map.put(i, "Value" + i);
        printTime("Put", start);

        start = System.nanoTime();
        String val = map.get(N / 2);
        printTime("Get by key", start);

        start = System.nanoTime();
        map.remove(N / 2);
        printTime("Remove by key", start);
    }

    private static void testHashSet() {
        System.out.println("\n--- HashSet ---");
        Set<Integer> set = new HashSet<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) set.add(i);
        printTime("Add", start);

        start = System.nanoTime();
        boolean exists = set.contains(N / 2);
        printTime("Contains", start);

        start = System.nanoTime();
        set.remove(N / 2);
        printTime("Remove", start);
    }

    private static void testQueue() {
        System.out.println("\n--- Queue (LinkedList) ---");
        Queue<Integer> queue = new LinkedList<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) queue.add(i);
        printTime("Add", start);

        start = System.nanoTime();
        Integer head = queue.poll(); // lấy phần tử đầu
        printTime("Poll (remove head)", start);
    }

    private static void testStack() {
        System.out.println("\n--- Stack ---");
        Stack<Integer> stack = new Stack<Integer>();

        long start = System.nanoTime();
        for (int i = 0; i < N; i++) stack.push(i);
        printTime("Push", start);

        start = System.nanoTime();
        Integer val = stack.pop();
        printTime("Pop", start);
    }

    private static void printTime(String operation, long startTime) {
        long duration = System.nanoTime() - startTime;
        System.out.printf("%-25s: %d ms\n", operation, TimeUnit.NANOSECONDS.toMillis(duration));
    }
}
