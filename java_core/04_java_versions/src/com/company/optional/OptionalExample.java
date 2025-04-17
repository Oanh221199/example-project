package com.company.optional;

import java.util.NoSuchElementException;
import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        //1. empty()
        // Tạo một Optional rỗng
        Optional<String> valueEmpty = Optional.empty();
        System.out.println("Tạo một Optional rỗng:");
        System.out.println(valueEmpty);

        //2. of(T value)
        // Tạo một Optional không null
        Optional<String> valueNotEmpty = Optional.of("Oanh");
        System.out.println("Tạo một Optional không null:");
        System.out.println(valueNotEmpty);

        // Tạo một Optional null use Optional of
        System.out.println("Tạo một Optional null use Optional of:");
        try {
            Optional<String> valueNull = Optional.of(null);
            System.out.println(valueNull);

        } catch (NullPointerException e){
            System.out.println("valueNull: " + e);
        }
        // 3. ofNullable(T value)
        //Tạo Optional cho phép giá trị null.
        System.out.println("Tạo Optional cho phép giá trị null:");
        Optional<String> valueAcceptNull = Optional.ofNullable(null);
        System.out.println(valueAcceptNull);

        // 4. get()
        System.out.println(" Get func:");
        //Lấy giá trị bên trong Optional. Nếu không có giá trị sẽ ném NoSuchElementException.
        String name = Optional.of("OanhTest").get(); // "OanhTest"
        System.out.println(name);

        try {
            Optional<String> optionalValue = Optional.empty(); // Optional không có giá trị
            // Thử lấy giá trị, sẽ ném NoSuchElementException
            String value = optionalValue.get(); // Lỗi xảy ra ở đây
            System.out.println("Value: " + value);

        } catch (NoSuchElementException e){
            System.out.println("optionalValue: " + e);
        }
        //  5. isPresent()
        //Trả về true nếu Optional có chứa giá trị
        System.out.println("Test isPresent(): ");
        Optional<String> test_is_present = Optional.of("hi");
        System.out.println(test_is_present.isPresent()); // true
        Optional<String> test_present = Optional.empty();
        System.out.println(test_present.isPresent()); // false

        // 6. orElse
        // Dùng orElse để gán giá trị mặc định nếu không có giá trị
        Optional<String> emptyOptional = Optional.ofNullable(null);
        String nameOrDefault = emptyOptional.orElse("default");
        System.out.println("Tên mặc định: " + nameOrDefault);


    }
}
