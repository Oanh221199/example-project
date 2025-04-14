package com.company.memory;
import java.util.ArrayList;
import java.util.List;

public class MemoryExample {
    private static final List<Person> cache = new ArrayList<Person>();

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime(); // truy cập bộ nhớ JVM

        System.out.println("=== Bắt đầu theo dõi bộ nhớ ===");

        for (int i = 0; i < 10; i++) {
            // Tạo object và giữ lại để tăng tiêu thụ bộ nhớ
            Person p = new Person("User " + i, 20 + i);
            cache.add(p);

            // Thống kê bộ nhớ
            printMemoryUsage(runtime, "Lần " + (i + 1));

            // Giả lập xử lý tốn thời gian
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("=== Gợi ý Garbage Collection ===");
        cache.clear(); // xóa tham chiếu đến object
        System.gc();   // gợi ý JVM thu hồi bộ nhớ

        try {
            Thread.sleep(2000); // chờ GC hoạt động
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        printMemoryUsage(runtime, "Sau khi GC");
    }

    private static void printMemoryUsage(Runtime runtime, String note) {
        long total = runtime.totalMemory();     // tổng bộ nhớ JVM có thể dùng
        long free = runtime.freeMemory();       // bộ nhớ còn trống
        long used = total - free;               // bộ nhớ đang dùng

        System.out.println("🔹 " + note);
        System.out.println("   Tổng (total): " + formatMB(total));
        System.out.println("   Đã dùng (used): " + formatMB(used));
        System.out.println("   Còn trống (free): " + formatMB(free));
        System.out.println("-----------------------------------");
    }

    private static String formatMB(long bytes) {
        return (bytes / (1024 * 1024)) + " MB";
    }
}

class Person {
    private String name;
    private int age;
    private int[] dummyMemory = new int[100000]; // tốn thêm bộ nhớ Heap

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("🗑️ Finalized: " + name);
    }
}
