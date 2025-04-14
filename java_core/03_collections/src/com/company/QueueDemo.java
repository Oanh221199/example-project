package com.company;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        // Khởi tạo Queue để lưu trữ đơn hàng
        Queue<Order> orderQueue = new LinkedList<Order>();

        // Thêm đơn hàng vào hàng đợi
        orderQueue.offer(new Order("O001", "An"));
        orderQueue.offer(new Order("O002", "Ly"));
        orderQueue.offer(new Order("O003", "My"));

        System.out.println("Đơn hàng trong hàng đợi:");
        // Duyệt qua các đơn hàng
        for (Order order : orderQueue) {
            System.out.println(order);
        }

        // Xử lý đơn hàng theo thứ tự FIFO
        System.out.println("\nXử lý đơn hàng theo thứ tự FIFO:");

        while (!orderQueue.isEmpty()) {
            Order order = orderQueue.poll(); // Lấy đơn hàng đầu tiên và loại bỏ khỏi hàng đợi
            System.out.println("Đang xử lý: " + order);
        }
    }
}
// Định nghĩa lớp đơn hàng
class Order {
    private String orderId;
    private String customerName;

    public Order(String orderId, String customerName) {
        this.orderId = orderId;
        this.customerName = customerName;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer: " + customerName;
    }
}