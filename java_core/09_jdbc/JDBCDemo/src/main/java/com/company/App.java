package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;

public class App {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testjdbc";
        String user = "root";
        String password = "root";

        Connection conn = null;

        try {
            // Kết nối CSDL
            conn = DriverManager.getConnection(url, user, password);
            conn.setAutoCommit(false); // Bắt đầu transaction

            // INSERT dữ liệu
            String insertSql = "INSERT INTO users (name, email) VALUES (?, ?)";
            PreparedStatement insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setString(1, "Test1");
            insertStmt.setString(2, "test1@example.com");
            insertStmt.executeUpdate();

            // UPDATE dữ liệu
            String updateSql = "UPDATE users SET email = ? WHERE name = ?";
            PreparedStatement updateStmt = conn.prepareStatement(updateSql);
            updateStmt.setString(1, "Test2@newdomain.com");
            updateStmt.setString(2, "Oanh");
            updateStmt.executeUpdate();

            // Commit transaction
            conn.commit();
            System.out.println("Transaction committed successfully!");

            // Truy vấn SELECT để hiển thị dữ liệu
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users");

            while (rs.next()) {
                System.out.println(rs.getInt("id") + " - " +
                        rs.getString("name") + " - " +
                        rs.getString("email"));
            }

            // Đóng tài nguyên
            rs.close();
            stmt.close();
            insertStmt.close();
            updateStmt.close();
            conn.close();

        } catch (Exception e) {
            // Rollback nếu có lỗi
            try {
                if (conn != null) {
                    conn.rollback();
                    System.out.println("Transaction rolled back due to error.");
                }
            } catch (Exception rollbackEx) {
                rollbackEx.printStackTrace();
            }
            e.printStackTrace();
        } finally {
            // Đảm bảo kết nối được đóng
            try {
                if (conn != null && !conn.isClosed()) {
                    conn.setAutoCommit(true); // Bật lại auto-commit nếu cần
                    conn.close();
                }
            } catch (Exception closeEx) {
                closeEx.printStackTrace();
            }
        }
    }
}
