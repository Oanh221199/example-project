package com.company.memory;

public class MemoryDemo {

    public static void main(String[] args) {
        // Tạo object
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();

        //  Đối tượng không được sử dụng sẵn sàng cho GC
        obj1 = null;

        // Gợi ý JVM thu gom rác
        System.gc();
        // 	Nếu GC thực thi, sẽ in "Object is being garbage collected."

        // Tạo object khác
        MyClass obj3 = new MyClass();
    }
}


class MyClass {
    // Phương thức được gọi trước khi đối tượng bị xóa khỏi bộ nhớ
    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("Object is being garbage collected.");
    }
}
