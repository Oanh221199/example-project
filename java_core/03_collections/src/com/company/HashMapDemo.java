package com.company;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // Tạo một HashMap để lưu trữ các từ tiếng Anh và nghĩa tiếng Việt của chúng
        HashMap<String, String> dictionary = new HashMap<String, String>();

        // Thêm các từ tiếng Anh và nghĩa tiếng Việt vào từ điển
        dictionary.put("apple", "táo");
        dictionary.put("banana", "chuối");
        dictionary.put("computer", "máy tính");

        // Tra cứu từ và in ra nghĩa tiếng Việt
        System.out.println("Meaning of 'apple': " + dictionary.get("apple"));
        System.out.println("Meaning of 'banana': " + dictionary.get("banana"));
        System.out.println("Meaning of 'computer': " + dictionary.get("computer"));

        // Kiểm tra nếu từ có tồn tại trong từ điển
        if (dictionary.containsKey("apple")) {
            System.out.println("\nThe word 'apple' is in the dictionary.");
        }

        // Xóa một từ khỏi từ điển
        dictionary.remove("banana");
        System.out.println("\nUpdated Dictionary after removing 'banana':");
        printDictionary(dictionary);
    }

    // Phương thức để in ra toàn bộ từ điển
    public static void printDictionary(HashMap<String, String> dictionary) {
        for (String word : dictionary.keySet()) {
            System.out.println(word + ": " + dictionary.get(word));
        }
    }

}
