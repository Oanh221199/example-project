package com.company;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> undoStack = new Stack<String>();

        String text = "";
        System.out.println("Khởi đầu: " + text);

        // Người dùng gõ văn bản
        text += "Xin chào";
        undoStack.push(text);
        System.out.println("Sau khi gõ: " + text);

        text += " thế giới";
        undoStack.push(text);
        System.out.println("Sau khi gõ thêm: " + text);

        text += "!";
        undoStack.push(text);
        System.out.println("Sau khi gõ dấu chấm than: " + text);

        // Người dùng nhấn "Undo"
        System.out.println("\n--- Người dùng nhấn UNDO ---");
        if (!undoStack.isEmpty()) {
            undoStack.pop(); // Bỏ trạng thái hiện tại
            text = undoStack.peek(); // Lấy trạng thái trước đó
        }
        System.out.println("Sau khi Undo 1: " + text);

        System.out.println("\n--- Undo lần nữa ---");
        if (!undoStack.isEmpty()) {
            undoStack.pop();
            text = undoStack.peek();
        }
        System.out.println("Sau khi Undo 2: " + text);
    }
}
