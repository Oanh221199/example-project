package com.company;

import java.util.HashMap;

public class DuplicateHashCodeEfficiency {
    static class Person {
        private final int id;
        private final boolean isKeyDiff;

        public Person(int id, boolean isKeyDiff) {
            this.id = id;
            this.isKeyDiff = isKeyDiff;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Person person = (Person) o;

            if (id != person.id) return false;
            return isKeyDiff == person.isKeyDiff;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", isKeyDiff=" + isKeyDiff +
                    '}';
        }

        @Override
        public int hashCode() {
            return isKeyDiff ? 1 : 2;
        }
    }

    public static void main(String[] args) {
        final int NUM_KEY = 1000000;
        final double NANO_TO_MS = 1_000_000.0;
        HashMap<Person, String> map = new HashMap<>();
        System.out.println("-------------Start insert----------");
        long startTime = System.nanoTime();

        // Insert 1 triệu key có hashcode trùng nhau.
        for (int i = 0; i < NUM_KEY; i++) {
            map.put(new Person(i, false), "Value" + i);

        }
        // Insert 1 key có hashcode không trùng nhau
        map.put(new Person(NUM_KEY + 1, true), "UniqueValue");
        long endTime = System.nanoTime();
        System.out.println("Time Insert: " + (endTime - startTime) / NANO_TO_MS + "ms");

        // Get key hashcode trùng nhau
        long startGetKeyDuplicate = System.nanoTime();
        String valueKeyDuplicate = map.get(new  Person(NUM_KEY, false));
        System.out.println(valueKeyDuplicate);
        long endGetKeyDuplicate = System.nanoTime();
        System.out.println("Time get value key duplicate: " + (endGetKeyDuplicate- startGetKeyDuplicate)/NANO_TO_MS + "ms");

        // Get key hashcode không trùng nhau
        long startGetKey = System.nanoTime();
        String valueKey = map.get(new  Person(NUM_KEY, false));
        System.out.println(valueKey);
        long endGetKey = System.nanoTime();
        System.out.println("Time get value key not duplicate: " + (endGetKey- startGetKey)/NANO_TO_MS + "ms");



    }
}
