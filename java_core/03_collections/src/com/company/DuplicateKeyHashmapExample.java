package com.company;

import java.util.HashMap;

public class DuplicateKeyHashmapExample {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("name", "Oanh");
        map.put("name", "My"); // Ghi đè giá trị cũ

        System.out.println(map); // {name=My}
    }
}
