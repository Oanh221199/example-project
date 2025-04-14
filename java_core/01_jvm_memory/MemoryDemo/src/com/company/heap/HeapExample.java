package com.company.heap;

public class HeapExample {
    public static void main(String[] args) {
        // Tạo các đối tượng trong Heap
        Student obj1 = new Student("Oanh", 1);
        Student obj2 = new Student("An", 2);

        // Sau khi kết thúc hàm main, obj1 và obj2 không còn được sử dụng nữa,
        // Garbage Collector sẽ thu hồi bộ nhớ.
    }
}
class Student{
    private String id;
    private int age;

    public Student(String id, int age) {
        this.id = id;
        this.age = age;
    }
}

